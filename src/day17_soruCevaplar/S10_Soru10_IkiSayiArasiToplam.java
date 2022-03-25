package day17_soruCevaplar;

import java.util.Scanner;

public class S10_Soru10_IkiSayiArasiToplam {
    public static void main(String[] args) {
        // Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
       //  toplayip, sonucu yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki tane tamsayi giriniz");
        int num1 = scan.nextInt();
        int num2 =scan.nextInt();
        int kucukNum =0;
        int buyukNum=0;
        int toplam =0;

        if(num1<num2) {
            kucukNum=num1; buyukNum=num2;
        } else {
            kucukNum=num2; buyukNum=num1;
        }

        for (int i=kucukNum; i<=buyukNum; i++) {
            toplam+=i;
        }
        System.out.println(kucukNum +"'dan (dahil) "+buyukNum+ "'a kadar (dahil) olan sayilarin toplami = "+toplam);

    }
}
