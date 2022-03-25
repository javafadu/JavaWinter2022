package day11_soruCevaplar;

import java.util.Scanner;

public class S02_Soru2_WordInSentence {
    public static void main(String[] args) {

        // Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
        // kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //  - Girilen kelime cumlede kullanilmamis.
        //  - Girilen kelime cumlede 1 kere kullanilmis.
        //  - Girilen kelime cumlede 1’den fazla kullanilmis.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Bir kelime giriniz");
        String kelime = scan.next();

        int in = cumle.indexOf(kelime);
        int in2 = cumle.indexOf(kelime, in + 1);

        if (cumle.indexOf(kelime) == (-1)) {
            System.out.println("Girilen kelime cumlede kullanilmamis");
        } else if (in2 == (-1)) {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        } else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");
        }

    }
}
