package day30_passByValue;

import java.util.Arrays;

public class C06_PassByValue {

    public static void main(String[] args) {

        /* non-primitive data turlerinde obje nin kendisi degil
        icindeki elementler degisirse
        Java obje nin refernasi ve obje nin KENDISI degismedigi icin
        element degisikliklerini kabul eder ve kalici yapar
        */


        int arr[]= {1,2,3};
        System.out.println(Arrays.toString(arr));
        arrDegistir(arr);
        System.out.println("Method call sonrasi: "+Arrays.toString(arr));

    }

    private static void arrDegistir(int[] arr) {
        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr));
    }
}
