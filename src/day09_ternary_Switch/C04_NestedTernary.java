package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {

        // Verilen sayinin pozitif mi negatif oldugunu kontrol edip
        // pozitif veya 0 ise sayi ise tek veya cift
        // negatif sayi ise -100 den buyuk veya kucuk
        // oldugunu belirleyen bir ternary yaziniz

        int sayi = 121;

        // Normal if else (nested) ile yapiyoruz:
        System.out.println("Nested If Else ile Yapiyoruz");
        if (sayi >= 0) {

            if (sayi % 2 == 0) {
                System.out.println("sayi pozitif cift sayi");
            } else {
                System.out.println("sayi pozitif tek sayi");
            }

        } else {

            if (sayi > -100) {
                System.out.println("-100 den buyuk negatif sayi");
            } else {
                System.out.println("-100 den kucuk negatif sayi");
            }

        }

        // Nested Ternary ile yapiyoruz
        System.out.println("Nested Ternary ile yapiyoruz");

        // String sonuc = sayi >= 0 ? ( sayi 0 veya pozitif ise ); ( sayi negatif ise );
        String sonuc = sayi >= 0 ?
                (sayi % 2 == 0 ? "pozitif cift sayi" : "pozitif tek sayi") :
                (sayi > -100 ? "-100 den buyuk negatif sayi" : "-100 den kucuk negatif sayi");
        System.out.println(sonuc);

    }
}
