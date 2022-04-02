package day33_varargs_StringBuilder;

public class C05_StringBuilder_compare_equals {
    public static void main(String[] args) {
        /*
        Compare iki sb'i esit mi diye kontrol etmek icin
        ilk harften baslayarak tum harfleri karsilastirir
        Ayni olan karakterler ici bir sey yazdirmaz
        Farkli olan ilk karakter icin ascii tablosuna gore kac deger
        geride veya ileride oldugunu yazdirir.

        TAMAMEN AYNI ise bize 0 dondurur.

        bir sb ile bir String comparet etmek istersek CTE verir

        */
        StringBuilder sb1 = new StringBuilder("Ali Can");
        StringBuilder sb2 = new StringBuilder("Ali Can");

        String str = "Ali Can";

        System.out.println(sb1.compareTo(sb2)); // 0

        // System.out.println(sb1.compareTo(str));

        // SB' da equals methodu String deki == gibi calisir, hem obje hem referans

        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.equals(sb1)); // true
        System.out.println(sb1.equals("Ali Can")); // false

        // System.out.println(sb1==str); // farkli obje turu odlugu icin CTE





    }
}
