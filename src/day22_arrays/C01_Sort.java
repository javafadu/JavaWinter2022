package day22_arrays;

import java.util.Arrays;

public class C01_Sort {
    public static void main(String[] args) {

        String arr[] = {"S", "M", "A", "T"};

        System.out.println(Arrays.toString(arr)); // [S, M, A, T]

        Arrays.sort(arr); // Natural Order (A-dan Z ye, veya kucukten dan buyuge)
        System.out.println(Arrays.toString(arr)); // [A, M, S, T]
    }
}
