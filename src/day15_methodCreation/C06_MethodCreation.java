package day15_methodCreation;

public class C06_MethodCreation {

    public static void main(String[] args) {
        // iki variable in degerlerini toplayan bir method olusturalim

        int a = 10;
        int b = 20;


        // ADIM-1 : method adini yazalim
        // ADIM-2 : method a gondermem gereken arguman var mi

        ikisayitopla(25,50); // farkli bir variable da gonderebiliriz

        C04.dortHarfiTersineCevir("sema"); // baska class a farkli icerik

    }
    // bir methodu olusturmak calismasi icin yeterli degildir.
    // method ancak cagrilirsa calisir
    // ayni class veya farkli class da olmasinin hicbir onemi yoktur
    // java main method'da yukaridan asagi dogru calisir
    // ve geldigi satiri calistirir

    private static void ikisayitopla(int a, int b) {
        System.out.println("Verilen iki sayinin toplami : "+ (a+b));
    }
}
