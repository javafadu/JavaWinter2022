package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {

    public static void main(String[] args) {

        int arr[]; // deger atamasi yapmadik ama Java kabul etti
                    // ancak kullanmamiza izin vermez, asagidaki 3 kod calismaz.
        // System.out.println(Arrays.toString(arr));
        // arr={1,2,3};
        // System.out.println(Arrays.toString(arr));

        arr=new int[6];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0]
        System.out.println(arr.length); // 6
                                        // String de length() var bundan parantez yok

        // array deki her bir elemani index degeri kadar artiralim, artirmak dedigimiz icin +=

        for (int i = 0; i < arr.length; i++) {
            arr[i]+=i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
