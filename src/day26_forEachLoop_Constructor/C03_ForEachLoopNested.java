package day26_forEachLoop_Constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoopNested {
    /*
    iki String array olusturunuz ve bu array’lerdeki
    ortak elemanlari For-each loop kullanarak bulunuz.
    Sonucu ekrana yazdiriniz.
    Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
     */

    public static void main(String[] args) {

        String array1[] = {"Ali", "Ayse", "Can", "Fatma"};
        String array2[] = {"Can", "Evren", "Emsal", "Fatma", "Emre", "Ali"};

        List<String> ortakElemanlar = new ArrayList<>();

        for (String each1 : array1
        ) {
            for (String each2 : array2
            ) {
                if (each1.equals(each2)) {
                    ortakElemanlar.add(each1);
                }
            }
        }

        if (ortakElemanlar.isEmpty()) {
            System.out.println("Ortak eleman yok");
        } else {
            System.out.println("Iki Array deki ortak elemanlar : "+ortakElemanlar);
        }


    }
}
