package day04_dataCastingIncrement;

public class C03_Casting {
    public static void main(String[] args) {

        int sayi1 = 8;
        int sayi2 = 4;

        System.out.println(sayi1/sayi2); //2

        sayi2=3;
        System.out.println(sayi1/sayi2); //2

        sayi1 = 22;
        System.out.println(sayi1/sayi2); //7

        // Java iki integer sayiyi birbirine bolerse sonucu da integer olarak verir
        // eger ondalik kesim varsa siler

        sayi1 = 4786;
        sayi2 = 10;

        sayi1 = sayi1/sayi2;
        System.out.println(sayi1); // 478

        sayi1 = sayi1/sayi2;
        System.out.println(sayi1); // 47

        sayi1 = sayi1/sayi2;
        System.out.println(sayi1); // 4

        sayi1 = sayi1/sayi2;
        System.out.println(sayi1); // 0

        sayi1 = 4895;
        double sayi3 = 10;

       // sayi1 = sayi1/sayi3;        // iki farkli sayi data turunu isleme koydugumuzda
                                    // java kucuk olan data turu icin Auto Widening yapar
                                    // bu islemde sayi1/sayi3 sonucunu double kabul ediyor
                                    // sag taraf artik double

        System.out.println(sayi1/sayi3); //489.5


    }

}
