package day07_soruCevaplar;

import java.util.Scanner;

public class S04_Soru4 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
        birbirine esit ise ekrana “Eskenar ucgen” yazdirin.
        Diger durumlarda ekrana “Eskenar degil” yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if(kenar1==kenar2 && kenar1==kenar3) {
            System.out.println("Girdiginiz ucgen eskenar ucgendir");
        }
        else if (kenar1<0 || kenar2<0 || kenar3<0) {
            System.out.println("Kenar uzunluklari pozitif bir sayi olmalidir");
        }
        else if (kenar1+kenar2<kenar3 || kenar2+kenar3<kenar1 || kenar1+kenar3<kenar2) {
            System.out.println("girdiginiz degerler ile ucgen olusturulamaktadir, iki kenar uzunlugu ucuncu kenar uzunlugundan buyuk olmalidir");
        }
        else {
            System.out.println("Girdiginiz ucgen eskenar ucgen degildir");
        }
        scan.close();
    }
}
