package day08_soruCevaplar;

import java.util.Scanner;

public class S11_Soru11 {
    public static void main(String[] args) {
        /*
        Soru 11 )Nested Nested If asagidaki soruyu cozen kodu yaziniz .
            Kullanicidan bir sifre girmesini isteyin

             Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
                Ilk harf A ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
             Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
                Ilk harf z ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Sifrenizi Giriniz");
        String sifre = scan.next();

        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            if (sifre.charAt(0) == 'A') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }
        } else if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
            if (sifre.charAt(0) == 'z') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }
        } else {
            System.out.println("Girilen sifre harf ile baslamiyor");
        }

        scan.close();

    }
}
