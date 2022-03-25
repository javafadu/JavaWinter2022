package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {

        int arr[] = {3,5,6,1,9,45,25,4,9,0};
        int istenenSayi = 26;
        // eger Java dan hazir binary search ile yapmak istersek
        // once sort methodunu kullanip, sonra binarySearch yapmaliyiz
        // binarySearch() bize istenen sayinin oldugu indexi verir

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.binarySearch(arr,istenenSayi)); // 2

        // eger olmayan bir elementi aratirsak
        // Java bulamadigini gostermek icin - isareti koyar
        // sonra da o sayi olsaydi siralamasi ne olacak ise o sirayi bize verir

        System.out.println(Arrays.binarySearch(arr,26)); // -10 (10. sayi olurdu)

    }
}
