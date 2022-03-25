package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); // [Aykut, Yusuf, Ilker, Oguzhan]

        isimler.set(1,"Secgin"); // Yusuf gitti yerine Secgin geldi
        System.out.println(isimler); // [Aykut, Secgin, Ilker, Oguzhan]

        // daha onceden listede var olanlari da arsiv gibi tutmak istersek

        List<String> logListesi = new ArrayList<>();

        logListesi.add(isimler.set(2,"Cosmos"));

        System.out.println(isimler);        // [Aykut, Secgin, Cosmos, Oguzhan]
        System.out.println(logListesi);     // [Ilker]

    }
}
