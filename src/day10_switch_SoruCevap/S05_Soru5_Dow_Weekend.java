package day10_switch_SoruCevap;

import java.util.Scanner;

public class S05_Soru5_Dow_Weekend {
    public static void main(String[] args) {
        // Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun adi giriniz");
        String gun = scan.next().toLowerCase();

        switch (gun) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Girdiginiz gun Hafta Ici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("Girdiginiz gun Hafta Sonu");
                break;
            default:
                System.out.println("Hatali Bir Gun Ismi Girdiniz");
        }

    }
}
