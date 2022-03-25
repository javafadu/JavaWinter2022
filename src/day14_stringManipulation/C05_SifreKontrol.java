package day14_stringManipulation;

import java.util.Scanner;

public class C05_SifreKontrol {
    public static void main(String[] args) {
         /*
        Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
            basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir
            sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */


        // HOCANIN COZUMU
        System.out.println("******HOCANIN COZUMU*****");

        String sifre = "Aasdf12345z";

        boolean ilkHarf = false;
        if(sifre.charAt(0)>='A' && sifre.charAt(0)<='Z') {
            ilkHarf = true;
        } else {
            System.out.println("Sifrenizin ilk harfi buyuk harf olmali");
        }

        boolean sonHarf = false;
        if(sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z') {
            sonHarf = true;
        } else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
        }

        boolean bosluk = false;
        if(!sifre.contains(" ")) {
            bosluk=true;
        } else {
            System.out.println("Sifre bosluk icermemeli");
        }

        boolean uzunluk = false;
        if (sifre.length()>=8) {
            uzunluk = true;
        } else {
            System.out.println("Sifreniz en az 8 karakter olmalidir");
        }

        if (ilkHarf && sonHarf && bosluk && uzunluk) {
            System.out.println("Sifreniz basarili bir sekilde kaydedildi");
        }



    }
}
