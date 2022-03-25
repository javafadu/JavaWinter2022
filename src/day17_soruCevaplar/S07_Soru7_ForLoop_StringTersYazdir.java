package day17_soruCevaplar;

import java.util.Scanner;

public class S07_Soru7_ForLoop_StringTersYazdir {
    public static void main(String[] args) {
        // Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.print("String bir ifade giriniz : ");
        String str = scan.nextLine();

        for (int i=str.length()-1; i>=0; i--) {

            System.out.print(str.substring(i,i+1));
        }
    }
}
