package day07_soruCevaplar;

import java.util.Scanner;

public class S01_Soru1 {
    public static void main(String[] args) {
        /*
        Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
olmadigini yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uzun kenari giriniz");
        double uzunKenar = scan.nextDouble();
        System.out.println("Lutfen kisa kenari giriniz");
        double kisaKenar = scan.nextDouble();
        if(uzunKenar==kisaKenar) {
            System.out.println("Girdiginiz sekil karedir");
        }
        else if (uzunKenar<=0 || kisaKenar<=0) {
            System.out.println("Kenar uzunluklari sifirdan buyuk olmalidir");
        }
        else {
            System.out.println("Girdiginiz sekil dikdortgendir");
        }
        scan.close();
    }
}
