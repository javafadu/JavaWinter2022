package day40_overriding_polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exception {
    // kullanicidan istedigi kadar sayiyi alip toplayan bir program yaziniz
    // toplam 500 u gecerse programi bitirsin veya
    // kullanici bitirmek istediginde Q ya bassin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int toplam=0;

        do {
            System.out.print("Lutfen toplamak istediginiz sayiyi giriniz \nbitirmek icin Q ya basiniz : ");
            int sayi = 0;


            try {
                sayi = scan.nextInt();
                toplam+=sayi;
            } catch (InputMismatchException e) {

                String hataliGiris=scan.next();
                if(hataliGiris.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("Hatali giris");
                }
            }



        } while (toplam<500);

        System.out.println("Girdiginiz sayilarin toplami : "+toplam);
    }
}
