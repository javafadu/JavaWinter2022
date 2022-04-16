package day45_interface_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste);  // [5, 7, 8, 6, 9]

        // foreach kullanarak her bir elementi 2 artiralim

        for (Integer each : liste
             ) {
            each=each+2;
        }



        Iterator itr = liste.iterator();

    }
}
