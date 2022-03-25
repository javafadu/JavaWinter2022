package day11_soruCevaplar;

import java.util.Scanner;

public class S01_Soru1_IndexOf {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan bir cumle ve bir harf isteyin,
        // harfin cumlede var olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String text1 = scan.nextLine();
        System.out.println("Please enter a letter");
        String letter1 = scan.next();

        if(text1.indexOf(letter1) != -1) {
            System.out.println(letter1 + "letter is in the sentence you entered.");
        }
        else {
            System.out.println(letter1 + " letter is not in the sentence you entered.");
        }

    }
}
