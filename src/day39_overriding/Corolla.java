package day39_overriding;

public class Corolla extends Toyota{

    protected String hiz = "Corolla maks 200 km hiz yapar";
    protected String yakit ="Corolla benzinli veya elektriklidir";


    protected String model = "Corolla";

    public void motor() {
        System.out.println("Corolla araclar cevreci motor kullanir");
    }

    public void yakitTuketimi() {
        System.out.println("Corrolla 5.6 lt yakit tuketir");
    }

    public void vitesSayisi() {
        System.out.println("Corolla 5 vitestir");
    }


    public static void main(String[] args) {

        /*
        Daga turu ve constructor farkli oldugunda
        Constructor calistigi icin obje Constructor in oldugu
        class ozelliklerini tasir
        ancak Data turu Parent class secildigi icin variable lar
        data turunun secildigi class ve onun parent class larindan deger alabilir.
         */

        /*
        Method lar icin ise yine data turunun oldugu class a gideriz
        Ancak, direk methodu calistirmadan once "method Override edilmis mi"
        diye kontrol ederiz.

         */


        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket); // Araba Class
        System.out.println(arb1.hiz);  // Corolla Class
        System.out.println(arb1.yakit); // Corolla
        System.out.println(arb1.marka); // Toyota Class
        System.out.println(arb1.sirketMerkezi); // Toyota Class
        System.out.println(arb1.model); // Corolla Class
        arb1.motor(); // Corolla Class

        Toyota arb2 = new Corolla();
        System.out.println(arb2.hareket); // Araba Class
        System.out.println(arb2.hiz);  // Toyota Class
        System.out.println(arb2.yakit); // Araba
        System.out.println(arb2.marka); // Toyota Class
        System.out.println(arb2.sirketMerkezi); // Toyota Class
        // System.out.println(arb2.model); // CTE
        arb2.motor(); // Corolla Class Override edilmis
        arb2.garanti(); // Toyota Class (override durumu yok)
        arb2.yakitTuketimi(); // Corolla Class
        // arb2.vitesSayisi();  data turu olan Toyota'dan baslayinca oyle bir method bulamadik
                                //  dolayisi ile CTE verir

        Araba arb3 = new Corolla();
        System.out.println(arb3.hareket); // Araba Class
        System.out.println(arb3.hiz);  // Araba Class
        System.out.println(arb3.yakit); // Araba
        System.out.println(arb3.marka); // Araba Class
        // System.out.println(arb3.sirketMerkezi); // CTE
        // System.out.println(arb3.model); // CTE
        arb3.yakitTuketimi(); // Araba class da bulduk ama Corolla class da override edilmis
        arb3.motor(); // Araba class da var, Toyota da var, Coralla da var override edilmis
        // arb3.garanti; Araba class da yok, onun uzeri de yok dolayisi ile CTE
        // arb3.vitesSayisi; CTE Araba'da yok, geri donmek yok,




    }


}
