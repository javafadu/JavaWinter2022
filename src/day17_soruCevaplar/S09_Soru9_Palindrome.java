package day17_soruCevaplar;

import java.util.Scanner;

public class S09_Soru9_Palindrome {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.

        Scanner scan = new Scanner(System.in);
        System.out.print("String bir ifade giriniz : ");
        String str = scan.nextLine();
        String strTers = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            strTers = strTers + str.substring(i, i + 1);
        }
        System.out.println("Girdiginiz String : " + str);
        System.out.println("Girilenin Tersi : " + strTers);
        String sonuc = str.equalsIgnoreCase(strTers) ? "Girilen String Palindrome dur" : "Girilen String Palindrome Degildir";
        System.out.println(sonuc);
    }
}
