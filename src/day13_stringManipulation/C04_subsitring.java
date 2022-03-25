package day13_stringManipulation;

public class C04_subsitring {
    public static void main(String[] args) {

        // 1-48 of 143 results for "nutella"
        // bu arama sonucundaki bulunan sonuc sayisi 100 den cok ise super
        // 100 den az ise az sonuc buldu yazdirsin

        String str = "1-48 of 14376 results for \"nutella\"";

        int sonIndex = str.indexOf(" result");
        int ilkIndex = str.indexOf("of ");
        System.out.println(str.substring(ilkIndex+3,sonIndex));

        System.out.println(str.substring(str.indexOf("of") + 3, str.indexOf("results")));

        System.out.println("******HOCA NIN COZUMU******");
        int ilkSpace = str.indexOf(" "); // 4
        int ikinciSpace = str.indexOf(" ", ilkSpace+1);
        int ucuncuSpace = str.indexOf(" ", ikinciSpace+1);

        String aramaSonucSayisiStr = str.substring(ikinciSpace+1,ucuncuSpace);
        System.out.println(aramaSonucSayisiStr);
        int aramaSonucSayisiInt = Integer.valueOf(aramaSonucSayisiStr);

        System.out.println(aramaSonucSayisiInt>1000?"Super sonuc":"100 den az sonuc");



    }
}
