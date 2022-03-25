package day12_stringManipulation;

import java.util.Scanner;

public class C06_SoruCevap {
    public static void main(String[] args) {

        // Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
        //basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir
        //sifre girin” yazdirin
        //- Ilk harf buyuk harf olmali
        //- Son harf kucuk harf olmali
        //- Sifre bosluk icermemeli
        //- Sifre uzunlugu en az 8 karakter olmali

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir şifre giriniz : ");
        String sifre = scan.nextLine();

        if(
                (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z') &&// ilk sart
                        (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z') &&
                        // ikinci sart
                        (!sifre.contains(" ")) && sifre.length()>=8
          )

        {
            System.out.println("Şifreniz BAŞARI İLE TANIMLANDI ! ");
        }else {
            System.out.println("İşlem başarısız. Lütfen yeni bir şifre girin... ");
        }
    }
}
