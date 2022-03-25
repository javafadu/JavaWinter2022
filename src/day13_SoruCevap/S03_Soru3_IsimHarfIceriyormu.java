package day13_SoruCevap;

import java.util.Scanner;

public class S03_Soru3_IsimHarfIceriyormu {
    public static void main(String[] args) {

        /*
        Kullanicidan isim isteyin. Eger
        -	isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
        -	isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
        -	ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz :");
        String isim = scan.nextLine();

        if(isim.indexOf("a")>=1) {
            System.out.println("Girdiginiz isim a harfi iceriyor");
        }
            if (isim.indexOf("Z")>=1) {
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        }
            if (isim.indexOf("a")<0 && isim.indexOf("Z")<0){
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }
    }
}
