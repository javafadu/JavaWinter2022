package day10_switch_SoruCevap;

import java.util.Scanner;

public class S06_Soru6_BetweenValues {
    public static void main(String[] args) {

        // Iki deger arasindaki duruma gore switch olusturma
/*
        kullanicidan bir not girmesini isteyin ve asagidaki skalaya gore hesaplayin
    not hesaplayici
            A => 90 ~100
            B => 80 ~ 89
            C => 70 ~ 79
            D => 60 ~ 69
            F =>  0 ~ 59
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1 ile 100 arasinda bir tam sayi giriniz");
        int num = scan.nextInt();


        switch ((int) num/10) {
            case 9:
                System.out.println("90-99 Araliginda");
                break;
            case 8:
                System.out.println("80-89 Araliginda");
                break;
            case 7:
                System.out.println("70-79 Araliginda");
                break;
            case 6:
                System.out.println("60-69 Araliginda");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("0-59 Araliginda");
                break;
            default:
                break;
        }
    }
}
