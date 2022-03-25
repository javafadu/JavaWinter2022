package day08_ifElseIfStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

        // Nested : ic ice
        /*
        Verilen cinsiyet ve yas icin kisinin emekli olup olmayacagini
        yazdiran bir java programi yaziniz
        Eger calisan kadinsa  60 yasindan buyuk olursa emekli olabilir.
        Eger calisan erkekse 65 yasindan buyuk olursa emekli olabilir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz" + "\nKadin icin K, \nErkek icin E harfini " +
                "giriniz");

        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {

            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsin \nDaha " + (60 - yas) + "yil calisman gerekir");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }

        } else if (cinsiyet == 'E') {

            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsin \nDaha " + (65 - yas) + "yil calisman gerekir");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }


        } else {

            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");
        }

        scan.close();
    }
}
