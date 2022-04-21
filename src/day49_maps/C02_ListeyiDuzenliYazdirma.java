package day49_maps;

import java.util.*;

public class C02_ListeyiDuzenliYazdirma {
    public static void main(String[] args) {

        // gorevimiz sinif listesini duzenli bir sekilde yazdirmak

        Map<Integer, String> sinif = MapOlustur.myMap();
        System.out.println(sinif);

        sinifListYazdir(sinif);

    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {
        System.out.println("Numara    Isim    Soyisim    Brans");
        System.out.println("======    =====   =======    =====");
        // Map yapisindan yazdirinca tek satir ve karisik bir sekilde olacak
        // Map deki datalari istedigimiz formata sokmamiz gerekir.

        // ADIM 1: key ve value lari map den alip 2 farkli collection uyesine atayalim
        //    Set<Integer> keySet = sinif.keySet();
        //    Collection<String> valueSet = sinif.values();


        ArrayList<Integer> keyList = new ArrayList<>();  // keyleri ketList listesine atalim
        keyList.addAll(sinif.keySet());

        ArrayList<String> valueList = new ArrayList<>(); // value lari valueList listesine atalim
        valueList.addAll(sinif.values());
        String arrStr[]=new String[valueList.size()];  // her value dizisini de bolup array e atamak icin


        for (int i = 0; i < keyList.size(); i++) {

            System.out.printf("%-10d",keyList.get(i)); // key leri sira sira aliyoruz


            valueList.set(i,valueList.get(i).replaceAll(","," "));
            // value degerinin icindeki , leri yok edip listenin icinde set ediyoruz

            arrStr=valueList.get(i).split(" ");
            // valueList deki her elementi " " lara parcalayip array e atiyoruz.

            for (int j = 0; j < arrStr.length; j++) { // array e atanan elemanlari yan yana yazdiriyoruz
                System.out.printf("%-5s",arrStr[j]);
            }
            System.out.println();

        }





    }
}
