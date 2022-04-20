package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {

        // List den gelen ozellikleri biliyoruz
        // onun icin Deque dan gelen ozelliklere bakalim

        Deque<Integer> ll1 = new LinkedList<>();
        ll1.addFirst(10); // basa element ekler, add methoduna gore daha hizlidir
        ll1.addLast(20); // sona element ekler, add methoduna gore daha hizlidir
        System.out.println(ll1); // [10, 20]
        System.out.println(ll1.element()); // 10 silmeden ilk elementi bize dondurur
        System.out.println(ll1); // [10, 20]
        System.out.println(ll1.getLast()); // 20 silmeden son elementi getiriyor
        System.out.println(ll1.getFirst()); // 10  silmeden ilk elementi getiriyor

        ll1.offer(30);  // sona ekler ama bize bisey dondurmez
        System.out.println(ll1); // [10, 20, 30]

        ll1.offerLast(40); // sona ekler ve bize true dondurur
        System.out.println(ll1); // [10, 20, 30, 40]

        ll1.offerFirst(50);
        System.out.println(ll1); // [50, 10, 20, 30, 40]

        System.out.println(ll1.peek()); // 50 ilk elementi bize silmeden dondurur
                                        // bulamazsa null donduruyor
        System.out.println(ll1.peekLast()); // 40





    }
}
