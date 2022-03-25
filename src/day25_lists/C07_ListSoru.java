package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C07_ListSoru {
    public static void main(String[] args) {

        // bir listede ortalamanin ustunde olan element sayisini bulunuz

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);

        ortUstundekiSayilar (sayilar);


    }

    private static void ortUstundekiSayilar(List<Double> sayilar) {
        int toplam = 0;

        for (int i = 0; i < sayilar.size(); i++) {
            toplam+=sayilar.get(i);
        }

        double ortalama = toplam/sayilar.size();

        List<Double> ortUstundekiler = new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) {
            if(sayilar.get(i)>ortalama) {
                ortUstundekiler.add(sayilar.get(i));
            }
        }

        System.out.println(ortUstundekiler);

    }
}
