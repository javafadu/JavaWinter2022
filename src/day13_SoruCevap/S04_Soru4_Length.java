package day13_SoruCevap;

import java.util.Locale;
import java.util.Scanner;

public class S04_Soru4_Length {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Isminizi Giriniz : ");
        String name = scan.nextLine();
        System.out.print("Lutfen Soyisminizi Giriniz : ");
        String surname = scan.nextLine();

        System.out.println("Isminiz : " + name.length() + " karakter");
        System.out.println("Soyisminiz : " + surname.length() + " karakter");
        System.out.println(name.length() >surname.length() ? "Isminizi daha uzun" : "Soyisminiz daha uzun");

    }

}
