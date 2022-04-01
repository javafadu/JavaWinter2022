package day30_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {
        /*
        Java Pass by Value bir programlama dilidir.
        Yani bir primitive variable'i argument olarak bir method a yollarsaniz
        Java o variable'i degil, degerini (value) method a yollar. (pass by value)
         */

        double etiketFiyati = 100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main method da etiket fiyati : "+etiketFiyati);


    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {

        etiketFiyati=etiketFiyati * 0.9;
        System.out.println("Sizin icin %10 indirimli fiyatimiz : "+etiketFiyati);

    }
}
