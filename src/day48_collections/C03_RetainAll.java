package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C03_RetainAll {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(10);
        set1.add(20);

        set2.addAll(set1) ;
        set2.add(25);
        set2.add(30);

        System.out.println("Set1 : "+set1); // [20, 10]
        System.out.println("Set2 : "+set2); // [20, 25, 10, 30]

        System.out.println(set2.retainAll(set1)); // set2 de set1 elementlerinin disinda kalanlarini sil
        System.out.println("Set1 : "+set1); // [20, 10]
        System.out.println("Set2 : "+set2); // [20, 10]
    }
}
