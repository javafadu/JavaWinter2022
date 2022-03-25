package day12_stringManipulation;

import java.util.Scanner;

public class C06_replacaAll {
    public static void main(String[] args) {

        // kullanicdan isim - soy isim bilgisini alıp
        // butun harfleri *** yapalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Isim Soyisminizi giriniz");
        String isim = scan.nextLine();

        System.out.println(isim.replaceAll("\\S", "*"));
    }
}
