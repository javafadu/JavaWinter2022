package day17_soruCevaplar;

import java.util.Scanner;

public class S04_Soru04_ForLoop {
    public static void main(String[] args) {
        // Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin.
        // 1’den baslayarak girilen sayiya kadar 3’u kati olan sayilari yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 100 den kucuk bir tamsayi giriniz : ");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ",");
            } else {

            }
        }

    }
}
