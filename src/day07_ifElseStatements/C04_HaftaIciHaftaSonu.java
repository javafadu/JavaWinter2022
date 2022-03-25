package day07_ifElseStatements;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {
        // Kullanicidan gun yazdirin
        // yazilan gunun hafta ici mi hafta sonu mu oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun yaziniz");
        String gun = scan.next().toLowerCase(); // kulllanici nasil yazarsa yazsin kucuk harfe ceviriyoruz

        // Eger stringlerde esitlik sorguluyorsak == kullanmamaliyiz.
        // Stringlerde esit olma durumunu sorgulamak icin equals()


        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Girdiginiz gun Haftasonudur");
        }

        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")) {
            System.out.println("Girdiginiz gun Haftaicidir");
        }


        scan.close();
    }
}
