package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {

        // kullaniciya kac elementlik bir array olusturacagini sorun
        // array i olusturup elementleri kullanicidan alip array e atayin

        Scanner scan = new Scanner (System.in);
        System.out.print("Lutfen kac elementli bir array istediginizi yaziniz : ");
        int uzunluk = scan.nextInt();

        int arr[] = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.print("Array icin "+(i+1) + " . elemani giriniz : ");
            arr[i]=scan.nextInt(); // 5
        }

        System.out.println("****OLUSTURULAN ARRAY******");
        System.out.println(Arrays.toString(arr));   // [12, 21, 33, 45, 8]

    }
}
