package day07_ifElseStatements;

import java.util.Scanner;

public class C04_GunIlkHarfGir {
    public static void main(String[] args) {
        // Kulanicidan gun isminin ilk harfini isteyin
        // ve harfe uygun olan gunlerin isimlerini yazdirin
        // c : carsamba, cuma, cumartesi
        // s : sali


        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen Gunun ilk harfini giriniz");
        char ilkHarf = scan.next().toUpperCase().charAt(0);

        // bu satir itibari ile girilen stringin ilk karakterini almis olduk

        // p , s , c

        if(ilkHarf=='P') {
            System.out.println("Pazar, Pazartesi, Persembe");

        }
        if(ilkHarf=='S') {
            System.out.println("Sali");

        }
        if(ilkHarf=='C') {
            System.out.println("Carsamba, Cuma, Cumartesi");

        }
        if (ilkHarf != 'P' && ilkHarf != 'S' && ilkHarf != 'C') {
            System.out.println("Lutfen gecerli bir harf yaziniz");
        }
        scan.close();

    }
}
