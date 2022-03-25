package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {

        // Kullanicidan ismini alip, basharfini ve son harfini buyuk harflerle yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String name = scan.nextLine();

        System.out.println("ilk harf : "+name.toUpperCase(Locale.forLanguageTag("TR")).charAt(0));
        System.out.println("Son harf: "+name.toUpperCase(Locale.forLanguageTag("TR")).charAt(name.length()-1));

        String isim1 ="";
        String isim2 = null; // yazdirabiliriz, deger atamadim, farkindayim
        String isim3; // yazdiramayiz, deger atamadim, farkinda degilim

        System.out.println("isim1 length :"+isim1.length());
        System.out.println("isim2 length :"+isim2.length());
    }
}
