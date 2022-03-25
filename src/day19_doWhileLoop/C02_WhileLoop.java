package day19_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

        Scanner scan = new Scanner (System.in);
        System.out.print("Bir sayi giriniz : ");
        int input = scan.nextInt();

        int rakam = 0;
        int rakamlarToplami=0;

        while (input>0) {
            rakam = input%10;
            rakamlarToplami+=rakam;
            input/=10;
        }

        System.out.println("Rakamlar Toplami : "+rakamlarToplami);
    }
}
