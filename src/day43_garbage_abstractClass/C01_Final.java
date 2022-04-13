package day43_garbage_abstractClass;

public class C01_Final {

    final static double piSayisi = 3.14;
    final static String okulIsmi = "Yildiz Koleji";


    public static void main(String[] args) {


        final int sayi = 10;
        // sayi=20;         final olarak isaretlendigi icin degisitirilemez

    }
    /*
    public static void method1() {
        /*
        Overrite parent class'daki method'u child class a uyarlamak demekti
        yani islevini degistirmek istiyoruz
        ancak parent class daki method final olarak tanimlandigindan
        Java method un uyarlanmasina izin vermiyor

        System.out.println("Parent class final method1");
    }
    */


}
