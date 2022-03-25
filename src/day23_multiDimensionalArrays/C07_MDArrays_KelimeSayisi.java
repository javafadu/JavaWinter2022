package day23_multiDimensionalArrays;

import java.util.Scanner;

public class C07_MDArrays_KelimeSayisi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String cumle = scan.nextLine();

        String arr[]=cumle.split(" ");
        System.out.println("Girdiginiz cumledeki kelime sayisi : "+arr.length);
    }
}
