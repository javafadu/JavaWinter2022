package day13_stringManipulation;

public class C03_substring {
    public static void main(String[] args) {

        String str = "Java ile IT cok guzel";
        System.out.println(str.substring(5)); //ile IT cok guzel

        // yukardaki stringi kullanarak "Mehmet Hoca ile IT cok guzel" yazdirin

        System.out.println(str.replace("Java","Mehmet Hoca"));
        System.out.println("Mehmet Hoca "+ str.substring(5));

        // IT cok guzel
        System.out.println(str.substring(9)); // yazilan index inclusive

        // Eger bir index'den sona kadar olan parcayi degil
        // belirli bir parcayi almak istersek
        // 2 parametre yazmak gerekiyor, str.substring(baslangicIndex,bitisIndex)
        // baslangic index ==> inclusive
        // bitis index ==> exclusive

        System.out.println(str.substring(0,5)); // "Java "
        System.out.println(str.substring(0,1)); // "J" (1. harfi bul)
        System.out.println(str.substring(5,6)); // "i" (6. harfi bul)

        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7)); // "" hiclik dondurur

        // System.out.println(str.substring(5,2)); // bitis index i baslangic index inden kucuk olamaz

        System.out.println(str.substring(str.length()-1)); // son harfi verir
        System.out.println(str.substring(str.length()-5)); // son 5 harfi verir
        System.out.println(str.substring(str.length())); // hiclik verir



    }
}
