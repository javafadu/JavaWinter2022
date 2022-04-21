package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        // inif listesini duzenli bir sekilde yazdirmak
        Map<Integer, String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap);

        // Eger key lere tek tek ulasmak istersek, index yapisinda ihtiyac var
        Set<Integer> sinifKeySeti = sinifListMap.keySet();
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(sinifKeySeti); // tek harekette tum keysey

        // Simdi de value leri index ile ulasabilecegimiz bir sekle sokalim
        Collection<String> sinifValueCollection = sinifListMap.values();
        System.out.println(sinifValueCollection);

        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueCollection);
        System.out.println(sinifValueList);

        /*
        her bir value birden fazla bilgiyi iceriyor.
        onun icin value leri multi dimensional bir array e atmak
        mantikli gorunebilir ancak md olusturabilmek icin boyutlari
        bilmeye ihtiyacimiz var
        */

        int outerArrayBoyut = sinifValueList.size();
        String ilkValue = sinifValueList.get(0);
        String ilkValueArray[] = ilkValue.split(", ");
        int innerArrayBoyut = ilkValueArray.length;

        String valueMDArr[][] = new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String tempArr[] = sinifValueList.get(i).split(", ");

            for (int j = 0; j < innerArrayBoyut; j++) {

                valueMDArr[i][j] = tempArr[j];

            }
        }

        // bu satira kadar key leri index ile ulasabildigim keyList e attik
        // value lari valueMDArr e attik
        // geriye yazdirmak kaldi key ve value leri istedigim gibi


        System.out.println("Numara  Isim  Soyisim  Brans");
        System.out.println("============================");

        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i) + "   ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                System.out.print(valueMDArr[i][j] + " ");
            }
            System.out.println();
        }


    }

}
