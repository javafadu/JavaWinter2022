package day40_overriding_polymorphism;

public class C04_ExceptionsTryCatch {
    public static void main(String[] args) {
        // String olarak verilen bir sayiyi, integer a cevirip
        // iki katini ekranda yazdiralim

        String str="12345a";

        // str icinde sayi olmayan bir karakter olursa
        // NumberFormatException.forInputString verir

        try {
            int sayi=Integer.parseInt(str);
            System.out.println("Girilen sayinin iki kati : "+sayi*2);
        } catch (Exception e) {
            System.out.println("girdiginiz string sayi omayan elementler iceriyor");
        }

    }

}
