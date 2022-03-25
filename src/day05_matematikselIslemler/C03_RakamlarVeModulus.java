package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarVeModulus {
    public static void main(String[] args) {
        // Kullanicidan aldiginiz 4 basamakli bir sayinin
        // basamaklardaki rakamlar toplamini bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tam sayi giriniz");
        int sayi = scan.nextInt();

        int rakam=0;
        int rakamlartoplami=0;

        // ADIM1: r=0; rt=0; sayi=7532
        rakam = sayi%10; // 2
        rakamlartoplami += rakam; // 2
        sayi /= 10; // sayi 753 olur

        // ADIM2: r=2; rt=2; sayi=753 oldu
        rakam = sayi%10; // 3
        rakamlartoplami += rakam; // 5
        sayi /= 10; // sayi 75 olur

        // ADIM3: r=3; rt=5; sayi=75 oldu
        rakam = sayi%10; // 5
        rakamlartoplami += rakam; // 10
        sayi /= 10; // sayi 7 olur

        // ADIM4: r=5; rt=10; sayi=7 oldu
        rakam = sayi%10; // 7
        rakamlartoplami += rakam; // 17
        sayi /= 10; // sayi 0 olur


        System.out.println("girdigini sayinin rakamlar toplami : "+rakamlartoplami);


    }
}
