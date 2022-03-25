package day06_concatenation_Operators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8); // false

        boolean sonuc1 = 5>4 && 7<9 && 6+3==9 && 5+2!=8; // true
        System.out.println(sonuc1);

        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8; // false (7>9)
        // T - F (cift & oldugu icin ilk false da durur)
        System.out.println(sonuc2);

        boolean sonuc3 = 5>4 & 7>9 & 6+3==9 & 5+2!=8; // false (7>9)
        // T - F - T - T (tek & oldugu icin hepsine bakiyor)
        System.out.println(sonuc3);


        int sayi3 = 15;
        // sayi3 un 10 ile 20 in arasinda oldugunu gosterin
        System.out.println(sayi3 > 10 && sayi3 < 20); // true

        int sayi4 = 5;
        // sayi4 un 10 ile 20 in arasinda olmadigini gosterin
        System.out.println(sayi4 < 10 || sayi4 > 20);


    }
}
