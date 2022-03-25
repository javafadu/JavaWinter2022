package day07_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {
        // Kullanicidan gun yazdirin
        // yazilan gunun hafta ici mi hafta sonu mu oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun yaziniz");
        String gun = scan.next().toUpperCase(); // kulllanici nasil yazarsa yazsin kucuk harfe ceviriyoruz

        // Eger stringlerde esitlik sorguluyorsak == kullanmamaliyiz.
        // Stringlerde esit olma durumunu sorgulamak icin equals()


        if (gun.equals("CUMARTESI") || gun.equals("PAZAR")) {
            System.out.println("Girdiginiz gun Haftasonudur");
        } else {
            System.out.println("Girdiginiz gun Haftaicidir");
        }

        scan.close();
    }
}
