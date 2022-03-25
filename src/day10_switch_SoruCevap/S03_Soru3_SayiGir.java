package day10_switch_SoruCevap;

import java.util.Scanner;

public class S03_Soru3_SayiGir {
    public static void main(String[] args) {
        // Kullanicidan bir sayi girmesini isteyin
        //Girilen sayi
        //10 ise “Iki basamakli en kucuk sayi
        //100 ise “uc basamakli en kucuk sayi”
        //1000 ise “dort basamakli en kucuk sayi”
        //diger durumlarda “Girdigin sayiyi degistir” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();

        switch (num) {
            case 10:
                System.out.println("Iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Girdigin sayiyi degistir");

        }
    }
}
