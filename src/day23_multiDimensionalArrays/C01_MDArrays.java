package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr[][] = {{3,1,7},{6,10,2}};

        System.out.println(arr[0][2]); // 7
        System.out.println(arr[1][1]); // 10

        // ilk INNER ARRAY in tum elementlerini yazdirin
        System.out.println(Arrays.toString(arr[0])); // [3, 1, 7]

        // MD array de TUM ARRAY i yazdiralim
        System.out.println(Arrays.deepToString(arr)); // [[3, 1, 7], [6, 10, 2]]



    }
}
