package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");

        System.out.println(isimler);    // [Aykut, Yusuf, Ilker, Oguzhan]

        // remove (istenenObject) method u istenen elementi kaldirip
        // bize true/false doner
        // eger remove isleminin yapildigini kontrol etmek isterseniz
        // method u boolean bir variable a atayip if le istediginizi yazdirabilirsiniz.


        boolean sonuc = isimler.remove("Oguzhan");  // true (listede var)

        if(sonuc==true) {
            System.out.println("Istediginiz isim silindi");
        } else {
            System.out.println("Istediginiz isim listede olmadigindan silinemedi");
        }

        System.out.println(isimler);   //  [Aykut, Yusuf, Ilker]


        sonuc = isimler.remove("Berk");  // false (listede yok)

        if(sonuc==true) {
            System.out.println("Istediginiz isim silindi");
        } else {
            System.out.println("Istediginiz isim listede olmadigindan silinemedi");
        }

        System.out.println(isimler);


        // remove(index) yazdigimizda silip silmedigi ihtimali kalmaz.
        // eger olmayan bir index yazarsak Exception yazar
        // bize remove edilen elementi doner

        isimler.remove(1);
        // System.out.println(isimler.remove(1)); // Yusuf (u siler, ve
                                                    // delil olarak Yusuf ismini bize dondurur

        // liste yi yazdirsak da yazdirmasak da liste degisti ve 1. index deki
        // element silindi.
        System.out.println(isimler); // [Aykut, Ilker]

    }
}
