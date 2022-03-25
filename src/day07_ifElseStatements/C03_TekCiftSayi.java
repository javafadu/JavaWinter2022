package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        // Kullanicidan bir sayi isteyin ve sayinin
        // tek veya cift sayi oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        // 153 % 2 == 0 sayi cift
        // 153 % 2 == 1 sayi tek

        if (sayi % 2 == 0) {
            System.out.println("Girdiginiz sayi cift sayidir");
        }

        if (sayi % 2 == 0 || sayi % 2 == -1) {
            System.out.println("Girdiginiz sayi tek sayidir");
        }

        System.out.println("Asagisi If Else ile yapiliyor");

        if(sayi % 2 ==1) {
            System.out.println("Girdiginiz sayi cift sayidir");
        }
        else {
            System.out.println("Girdiginiz sayi tek sayidir");
        }


        System.out.println("katildiginiz icin tesekkur ederiz");

        scan.close();
    }
}
