package day46_iteratorCollections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste);  // [5, 7, 8, 6, 9]

        Iterator itr = liste.iterator(); // iterator methodunu olusturdugumuz liste objesi
                                        // uzerinden ArrayList class indan calistiriyoruz

        /*
        Iterator Nasil Calisir:
        bir iterotor objesi olusturmak icin Collection uyesi bir obje kullanmaliyiz
        Iterator itr = liste.iterator();
        yani biz bu iterator objesini bizim ornegimizde liste objesi uzerinde calismak
        icin olusturmus olduk. itr sadece listede calisir.
        biz iterator objesini olusturdugumuzda
        iterator collection'in ilk elementinin oncesine gidip bekler

        [ (itr)5, 7, 8, 6, 9]
        itr.hasNext() ==> true  itertor a yaninda eleman var mi diye sorar (true veya false)
        itr.next() ==> iterator bir sonrali elementin yanina gecer, ve uzerinden gectigi elementi bize dondurur
        [ 5, (itr)7, 8, 6, 9] ==> bize 5 dondurur
        itr.next() ==>
        [ 5, 7, (itr)8, 6, 9] ==> bize 7 dondurur
        itr.remove() ==> iterator un elinde olan elementi sildi. Dolayisi ile ust uste
                        iki kere iterator itr.remove() kullanilamaz. Once itr.nex() methodu
                        calistirip, iterator un bir element almasini saglamaliyiz
         */

        System.out.println(itr.hasNext());  // true
        System.out.println(itr.next());     // 5
        System.out.println(itr.next());     // 7
        itr.remove();     //
        System.out.println(liste);

        // itr.remove();



    }
}
