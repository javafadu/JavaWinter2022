package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);                     // [5]
        sayilar.add(3);                     // [5, 3]
        sayilar.add(0,7);   // [7, 5, 3]
        sayilar.add(2,7);   // [7, 5, 7, 3]
        System.out.println(sayilar);       // [7, 5, 7, 3]

        sayilar.remove(3);  // index 3 deki elementi siler
        // sayilar.remove(5);  // exception verir IndexOutOfBoundsException

        /*
        sayilardan olusan bir list de obje yi vererek element remove etme method y calismaz
        sayi degeri girdigimizde Java otomatik olarak sayiyi index kabul eder
         */

        // int sayi = 5;
        // sayilar.remove(sayi); //IndexOutOfBoundsException

        Integer sayi=5;              // primitive degil, obje oldugu icin
        sayilar.remove(sayi);        // index degil obje yi remove etti
        System.out.println(sayilar); // [7, 7]








    }
}
