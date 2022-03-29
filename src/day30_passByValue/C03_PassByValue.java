package day30_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

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
