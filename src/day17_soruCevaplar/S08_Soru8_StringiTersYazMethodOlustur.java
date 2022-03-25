package day17_soruCevaplar;

import java.util.Scanner;

public class S08_Soru8_StringiTersYazMethodOlustur {
    public static void main(String[] args) {
        // Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren
        //bir method yazin.


        Scanner scan = new Scanner(System.in);
        System.out.print("String bir ifade giriniz : ");
        String str = scan.nextLine();

        stringiTersYaz(str);

    }

    private static void stringiTersYaz(String str) {

        for(int i=str.length()-1; i>=0; i--) {
            System.out.print(str.substring(i,i+1));
        }
    }
}
