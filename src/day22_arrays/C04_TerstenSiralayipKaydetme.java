package day22_arrays;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class C04_TerstenSiralayipKaydetme {
    public static void main(String[] args) {

        // verilen bir array i buyukten kucuge siralayip bize donduren

        int arr[] = {3,5,6,1,9,0,45,25,4,9,0};

        arr=terstenSirali(arr);
        System.out.println(Arrays.toString(arr));




    }

    private static int[] terstenSirali(int[] arr) {

        Arrays.sort(arr);

        int tersArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tersArr[i] = arr[arr.length-1-i];
        }
        return tersArr;
    }
}
