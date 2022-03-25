package day17_soruCevaplar;

import java.util.Scanner;

public class S11_Soru11_Faktoriyel {
    public static void main(String[] args) {
        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin ve girilen
        // sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        Scanner scan = new Scanner(System.in);
        System.out.println("10 dan kucuk bir tamsayi giriniz");
        int num1 = scan.nextInt();

        for (int i=num1-1; i>=1; i--) {
            num1*=i;
        }
        System.out.println("Girdiginiz "+num1 + " sayisinin faktoriyeli : "+num1);
    }
}
