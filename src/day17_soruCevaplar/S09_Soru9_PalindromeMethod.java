package day17_soruCevaplar;

import java.util.Scanner;

public class S09_Soru9_PalindromeMethod {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir method yazin.

        Scanner scan = new Scanner(System.in);
        System.out.print("String bir ifade giriniz : ");
        String str = scan.nextLine();


        palindrome(str);




    }

    private static void palindrome(String str) {
        String strTers = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            strTers+=str.substring(i,i+1);
        }

        System.out.println("Girdiginiz Metin : "+str);
        System.out.println("Metinin tersi : "+strTers);

        if (str.equalsIgnoreCase(strTers)) {
            System.out.println("Metin Palindrome dur");
        } else {
            System.out.println("Metin Palindrome degildir");
        }

    }

}
