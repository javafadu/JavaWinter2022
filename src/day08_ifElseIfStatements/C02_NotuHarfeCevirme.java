package day08_ifElseIfStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {
         /*
        Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        Not’u harf sistemine cevirip yazdirin.
        50’den kucukse “D”,
        50-60 arasi “C”,
        60-80 arasi “B”,
        80’nin uzerinde ise “A”
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz" );
        double puan = scan.nextDouble();

        if(puan<0 || puan>100) {
            System.out.println("Hatali giris yaptiniz");
        }
        else if(puan <50) {
            System.out.println("Puaniniz : D");
        }
        else if (puan <60) {
            System.out.println("Puaniniz : C");
        }
        else if (puan<80) {
            System.out.println("Puaniniz : B");
        }
        else  {
            System.out.println("Puaniniz : A");
        }

        scan.close();
    }
}
