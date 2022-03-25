package day11_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Java Guzeldir";

        // Biz string methodlarini arka arkaya kullanabiliriz
        // mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim

        // str.charAt(5); boyle yazdigimizda sonuc artik String degil char olacaktir.
        // dolayisi ile String'de yapmak istedigimiz tum degisiklikleri
        // once yazip sonra charAt() methodu kullanmaliyiz
        System.out.println(str.charAt(5)); // G
        System.out.println(str.toLowerCase().charAt(5)); // g

        //hepsini buyuk harf yapalim
        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR"))); // JAVA GUZELDİR


    }
}
