package day18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {

        // kulllanicidan toplamak istedigi sayilari alin
        // ve kullanici 0 a basincaya kadar devam edin
        // kullanici 0 a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

       /* for (int i = 1; i <= 100000; i++) {
            System.out.print("Lutfen bir sayi giriniz : ");
            sayi = scan.nextInt();
            if (sayi == 0) {
                break;
            } else {
                toplam += sayi;
            }

            }
            System.out.println("Girilen sayinin Toplami : "+toplam);
*/

        // while ile yapalim

        sayi = 1; // 0 yazarsak while calismaz o yuzden 1 yaptik
        toplam = 0;

        while (sayi != 0) {
            System.out.print("Lutfen bir sayi giriniz : ");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println("Girilen sayinin Toplami : " + toplam);

        // baslangic bitis ve degisim degerleri ne olan durumlarda for loop daha avantajli
        // ama adim sayisi belli olmayan durumlarda "while loop" daha avantajlidir

    }
}

