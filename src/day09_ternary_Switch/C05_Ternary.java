package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {

        // Bazen ternary daki iki sonucun data turleri farkli olabilir

        // verilen sayi 100 den buyukse sayi'nin karesini alip yazdiran
        // 100 den kucukse "sayi 100 den buyuk olmali" yazdiran bir ternary olusturalim

        int sayi = 50;
        // ternary bize sonuc getirdigindan ya sonucu direk yazdirmaliyiz
        // veya bir degiskene atamaliyiz
        // Eger sonuclar farkli data turlerinde ise
        // atama yapacagimiz variable'in turu tek olacagindan
        // atama yapamayiz
        // SADECE direk yazidrabiliriz.

        System.out.println(sayi>100 ? sayi*sayi : "Sayi 100 den buyuk olmalidir");

    }
}
