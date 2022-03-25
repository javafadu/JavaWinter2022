package day08_soruCevaplar;

import java.util.Scanner;

public class S10_ArtikYil1 {
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

        // Once normal if else ile yapalim

        if (yil % 4 == 0 && yil % 100 != 0) {
            System.out.println("Artik yil");
        } else if (yil % 100 == 0 && yil % 400 == 0) {
            System.out.println("Artik yil");
        } else {
            System.out.println("Artik yil degil");
        }

        System.out.println("******Ogrenci Cozum****");

        if (yil%4!=0){
            System.out.println("artik yil degil");
        } else if (yil%100!=0){
            System.out.println("artik yildir");
        }else if (yil%400==0){
            System.out.println("artik yildir");
        }else {
            System.out.println("artik yil degildir");
        }
    }
}
