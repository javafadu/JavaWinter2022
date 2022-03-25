package day07_soruCevaplar;

import java.sql.SQLOutput;
import java.util.Scanner;

public class S03_Soru3 {
    public static void main(String[] args) {
        /*
        Kullaniciya yasini sorun, eger yas 65’den kucuk ise
        “emekli olamazsin, calismalisin”, 65’e esit veya buyukse
        “Emekli olabilirsin” yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if(yas<65) {
            System.out.println("Emekli olamazsin, calismalisin");
        }
        else if (yas<0){
            System.out.println("Lutfen yasinizi dogru giriniz");
        }
        else {
            System.out.println("Emekli olabilirsiniz");
        }
        scan.close();
    }
}
