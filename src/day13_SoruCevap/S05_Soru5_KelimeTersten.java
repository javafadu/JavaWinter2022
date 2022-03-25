package day13_SoruCevap;

import java.util.Scanner;

public class S05_Soru5_KelimeTersten {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 4 harfli bir kelime giriniz : ");
        String kelime = scan.nextLine();

        if(kelime.length()!=4) {
            System.out.println("Girdiginiz kelime 4 harfli degildir");
        }
        else {
            System.out.print("Girdiginiz Kelimenin Tersten Yazilisi : ");
            System.out.print(kelime.substring(3,4));
            System.out.print(kelime.substring(2,3));
            System.out.print(kelime.substring(1,2));
            System.out.print(kelime.substring(0,1));
        }
    }


}
