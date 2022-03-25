package day25_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_ListedeSwap {
    public static void main(String[] args) {

        // verilen bir List de, istenen iki indexdeki elementlerin yerini
        // kalici olarak degistiren bir method olusturun

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);

        Scanner scan = new Scanner(System.in);
        System.out.print("Mevcut Liste: "+sayilar);
        System.out.println();
        System.out.print("Yer degistireceginiz ilk index no girin : ");
        int ilkIndex = scan.nextInt();
        System.out.print("Yer degistireceginiz ikinci index no girin : ");
        int ikinciIndex = scan.nextInt();

        System.out.println("Sayilar ilk hali: " + sayilar);

        if (ilkIndex > sayilar.size() || ikinciIndex > sayilar.size()) {
            System.out.println("Hatali index numarasi");
        } else if (ilkIndex < 0 || ikinciIndex < 0) {

        } else {
            sayilar = swapElements(sayilar, ilkIndex, ikinciIndex);
            System.out.println("Sayilar Swap Sonrasi: " + sayilar);
        }


    }


    public static List<Double> swapElements(List<Double> sayilar, int ilkIndex, int ikinciIndex) {


        // bir temp sayi olusturup
        // verilen index lerdeki sayilari yer degistirin
        // index leri kontrol edip sinirin otesinde olanlari uyari mesaji yazdirin


        double temp = sayilar.get(ilkIndex);
        sayilar.set(ilkIndex, sayilar.get(ikinciIndex));
        sayilar.set(ikinciIndex, temp);

        return sayilar;

    }
}
