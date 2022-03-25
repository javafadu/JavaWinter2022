package day13_SoruCevap;

import java.util.Scanner;

public class S06_Soru6_SifreTanimlama {
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
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen olusturacaginiz sifreyi giriniz : ");
        String pwd = scan.nextLine();

        if ((pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') &&
                (pwd.charAt(pwd.length() - 1) >= 'a' && pwd.charAt(pwd.length() - 1) <= 'z') &&
                (pwd.indexOf(" ") < 0) &&
                (pwd.length() >= 8)
        ) {
            System.out.println("Sifre basari ile tanimlandi");
        } else {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }

    }
}
