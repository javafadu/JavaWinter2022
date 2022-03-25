package day08_soruCevaplar;

import java.util.Scanner;

public class S09_ArtilYilNestedIf {
    public static void main(String[] args) {
  /*
    Kullanicidan artik yil olup olmadigini ogrenmek icin bir "yil" girmesini isteyelim
    Kural 1: 4 ile bolunemeyen yillar artik yil degildir
    Kural 2: 4 un kati olmasina ragmen 100 ile bolunebilen yillardan
            sadece 400 un kati olan yillar artik yildir.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir yıl giriniz");
        int yil = scan.nextInt();

        // Nested if ile cozuyoruz

        if (yil % 100 == 0) { //100 e bolunebiliyor
            if (yil % 400 == 0) {
                System.out.println("Artik Yildir");
            } else {
                System.out.println("Artik Yil Degildir");
            }
        } else { // 100 e bolunemiyor
            if (yil % 4 == 0) {
                System.out.println("Artik Yildir");
            } else {
                System.out.println("Artik Yil Degildir");
            }
        }

        scan.close();
    }
}
