package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {
        // Kullanicidan gun yazdirin
        // eger gun kullanici gun ismini yanlis girerse "Yanlis Giris"
        // yazilan gunun hafta ici mi hafta sonu mu oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun yaziniz");
        String gun = scan.next().toLowerCase(); // kulllanici nasil yazarsa yazsin kucuk harfe ceviriyoruz

        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Girdiginiz gun Haftasonudur");
        } else if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")) {
            System.out.println("Girdiginiz gun Haftaicidir");
        } else {
            System.out.println("Yanlis Giris");
        }
        scan.close();
    }
}
