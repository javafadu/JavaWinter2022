package day04_dataCastingIncrement;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        // 7: Kullanicidan ismini isteyip isminin bas harfini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi Giriniz");
        char ilkHarf = scan.next().charAt(0);
                                    // charAt(index) methodu parametre olarak yazdigimiz index deki
                                    // degeri getirir, baslangic 0 dir.
        System.out.println("Girdiginiz ismin ilk harfi : "+ilkHarf);

        scan.close();
    }
}
