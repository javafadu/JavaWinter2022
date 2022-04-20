package day47_linkedList;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {

    public static void main(String[] args) {

        /*
        Linked List in 2 tane interface i vardir
        LinkedList olustururken data turu olarak
        LinkedList secersem : iki parent daki tum methodlar
        List secersem : sadece List interface deki methodlar
        Deque/Queue secersem : Deque daki methodlari kullanabiliriz
        */

        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(10);  // Linkedlist methodu,

        // sadece List interface inden ozellikler kullanmak istersek
        List<Integer> ll2 = new LinkedList<>();
        ll2.add(5);
        ll2.remove(0);


        // sadece  Deque den gelen ozellikleri kullanmak istersek
        Deque<Integer> ll3 = new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);
        System.out.println(ll3); // [15,20]
        ll3.addLast(40); // [15,20,40]


    }
}
