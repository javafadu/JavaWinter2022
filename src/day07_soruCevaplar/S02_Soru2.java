package day07_soruCevaplar;

import java.util.Scanner;

public class S02_Soru2 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter = scan.next().charAt(0);
        if((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter <='z')) {
            System.out.println("Girdiginiz karakter harftir");
        }
        else {
            System.out.println("Girdiginiz karakter harf degildir");
        }
        scan.close();

    }
}
