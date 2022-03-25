package day04_dataCastingIncrement;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        // double bir variable olusturalim ve bunu int sonra da byte a cevir

        int sayi1=879;
        double sayi2=10;
        double sayi3 = sayi1 / sayi2; //87.9
        System.out.println(sayi3);

        int sayi4 = (int) (sayi1/sayi2);  // 87.9
                                         // deger double, variable int
                                         // yani variable daha dar dolayisi ile java bunu auto yapmaz
                                         // sorumlulugu ustlenmemizi ister
                                         // sag tarafa yazdirdigimi (int) sorumluluk bende demek
        // int sayi4 = sayi1/(int) sayi2; bu da calisir
        System.out.println(sayi4);  // 87


        int sayi5 = 520;
        byte sayi6 = (byte) sayi5; // sag taraftaki deger int > soldaki byte dan
                            // sag tarafa (byte) , sorumluluk bende
        System.out.println(sayi6);

        sayi5=129;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);//-127

        sayi5=260;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);//4

        sayi5=520;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);//8

        sayi5=-130;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);//126

        sayi5=44;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);//44


        double numDouble = 383.56;
        int numInt = (int)numDouble;
        System.out.println("Integer Variable Degeri: "+numInt);
        //double dan int a gecerken eger sayida ondalik varsa
        //java ondalikli bolumu siler (yoksayar)

        byte numByte = (byte)numInt;
        //daha dar (narrow) bir data tipine cevirirken eger data tipinin sinirindan buyukse
        //saymaya negatif en kucuk sayidan devam eder, istenen sayiya gelinceye kadar tekrar tekrar
        //en kucuk negatif sayiya gider
        //byte -128 den +127 arasinda
        System.out.println("Byte Variable Degeri: "+numByte);
    }
}
