package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) throws IllegalAccessException {

        /*
        Kullanicidan yasini isteyin
        Kullanici yas olarak negatif bir sayi, 0 veya 120 den buyuk bir sayi girerse
        illegelArgumentException oluscak sekilde bir program yazini
         */

        Scanner scan = new Scanner (System.in);
        System.out.print("Lutfen yasinizi giriniz : ");
        int yas = scan.nextInt();

        if(yas<0 || yas==0 || yas>120) {
            // System.out.println("lutfen gecerli bir yas giriniz");
            // java bizim istedigimiz durumlarda exception firlatabilir
            throw new IllegalArgumentException();
        } else {
            System.out.println("uygun yas girdiniz");
        }
    }
}
