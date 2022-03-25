package day11_stringManipulation;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {

        String str1 = "Java bir baska guzel valla cok guzel";
        // istersek char olarak verdigimiz bir harfini index ini bize dondurur
        System.out.println(str1.indexOf('J')); // 0

        // istersek bir harf veya metin olarak verdigimiz String'in index ini bize dondurur
        System.out.println(str1.indexOf("l")); //  19
        System.out.println(str1.length() - 1); // 35
        System.out.println(str1.indexOf("aska")); // 10

        // ayni harften birden fqzla varsa ?
        System.out.println(str1.indexOf("b")); // 5 (buldugu ilk dogru eslesmenin index ini dondurur


        System.out.println(str1.indexOf('b', 5)); // 5
        // bu method'da Java aramaya fromindex olarak yazdigimiz index den baslar
        // (inclusive)

        // verilen String'deki ikinci a harfinin index ini bulalim
        int ilkindex = str1.indexOf('a'); // 1 dondurecek
        System.out.println(str1.indexOf('a', ilkindex + 1)); // 3 dondurdu,

        // verilen String'deki ikinci b harfinin index ini bulalim
        int ilkindex2 = str1.indexOf('b'); // 5 dondurecek
        System.out.println(str1.indexOf('a', ilkindex2 + 1)); // 10 dondurdu,

        // 20. indexden sonra guzel aratalim
        System.out.println(str1.indexOf("guzel",20)); // 31. index

        // metinde olmayan bir harf aratsak
        System.out.println(str1.indexOf("y")); // y yok demesi lazim ama return type index olmali
        // yok demenin sayisal karsiligi olarak java -1 dondurmeyi tercih etmistir

        // kulllanicidan mail adresini isteyin, @ isareti icermiyorsa gecersiz yazdirin
        // iceriyorsa mailiniz kabul edildi yazin

        Scanner scan = new Scanner(System.in);
        System.out.println("E-mail adresinizi girin");
        String email = scan.next();

        if (email.indexOf("@")==(-1)) {
            System.out.println("Gecersiz E-mail adresi");
        } else {
            System.out.println("E-Mailiniz kabul edildi");
        }

        // OZET : indexOf methodu icerirse yazilan String veya char'in
        // metinde hangi index'de oldugu bize dondurur
        // eger aradigimiz metin veya char yoksa, olmadiginin delili olarakk
        // bize -1 dondurur.



    }
}
