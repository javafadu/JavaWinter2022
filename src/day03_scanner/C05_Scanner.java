package day03_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Yaricapi giriniz");
        double yaricap = scan.nextDouble();

        System.out.println("Girdiginiz yaricap : "+yaricap);
        System.out.println("Cemberin Cevresi : "+(2*3.14*yaricap));
        System.out.println("Dairnin Alani : "+(3.14*yaricap*yaricap));

        scan.close();
    }

}
