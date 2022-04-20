package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {

        // verilen bir arrayin tekrar eden elementlerini sadece 1 kere yazdiran method olusturun

        Integer arr[]={3,5,6,4,6,7,8,7,4,6,3};
        arrayiTekrarsizYazdirMethodu(arr);
    }


    private static void arrayiTekrarsizYazdirMethodu(Integer[] arr) {
        Set<Integer> tekrarsizElementKumesi = new HashSet<>();

        for (Integer each:arr
             ) {
            tekrarsizElementKumesi.add(each);
        }

        System.out.println(tekrarsizElementKumesi);
    }




}
