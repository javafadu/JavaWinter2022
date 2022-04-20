package day47_linkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_ArraydenTekrarlariSilme {

    // verilen bir arrayden tekrar eden elementleri silip
    // unique elementlerden olusan bir array halinde donduren
    // bir method create edin

    public static void main(String[] args) {

        Integer arr[]={3,5,6,4,6,7,8,7,4,6,3};

        arr= benzersizYap(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static Integer[] benzersizYap(Integer[] arr) {

        Set<Integer> benzersizSet = new TreeSet<>();
        for (Integer each: arr
             ) {
            benzersizSet.add(each);
        }
        System.out.println(benzersizSet);

        // Set de index yapisi yoktur dolayisi ile for loop kullanamayiz
        int index = 0;
        Integer arrBenzersiz[]=new Integer[benzersizSet.size()];

        for (Integer each:benzersizSet
             ) {
            arrBenzersiz[index]=each;
            index++;

        }

        return arrBenzersiz;
    }


}
