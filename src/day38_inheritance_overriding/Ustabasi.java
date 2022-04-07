package day38_inheritance_overriding;

public class Ustabasi extends Isci{

    public String statu = "Ustabasi";
    public String haklar = "Ustabasi haftada 1 gun esktra tatil hakkina sahip";

    public void mesai() {
        System.out.println("Ariza varsa ustabasi ekstra ucret almadan calisir");
    }

    public void maasHesapla() {
        System.out.println("Ustabasi 30 gun * 8 saat * 12 eur = "+(30*8*12)+" Eur maas alir");
    }

    public static void main(String[] args) {

        /*
        Icinde oldugumuz Class dan klasik hali ile bir obje olusturursak
        o obke ile cagirdigimiz variable ve method larda
        Java once icinde bulundugumuz class a bakar
        VARSA :
        bize onu getirir.
        YOKSA :
        parent class lara bakar, ilk buldugunu getirir.

         */
        System.out.println("Yasin");

        Ustabasi yasin = new Ustabasi();
        System.out.println(yasin.statu);  // Ustabasi
        System.out.println(yasin.haklar); // Ustabasi haftada 1 gun esktra tatil hakkina sahip
        System.out.println(yasin.ikramiye); // Isciler yilda 1 ikramiye alir
        System.out.println(yasin.izin); // Tum personel yilda 4 hafta izin kullanabilir
        yasin.maasHesapla();
        yasin.mesai();

        System.out.println("--------------------------");
        System.out.println("Ahmet");
        /*
        Eger isci olarak ozelliklerini gormek istersek
        Class adini (Data Turu) Isci seceriz
         */
        Isci ahmet = new Ustabasi();
        System.out.println(ahmet.statu); // Isci
        System.out.println(ahmet.haklar); // Isciler kidem tazminati alirlar
        System.out.println(ahmet.ikramiye); //Isciler yilda 1 ikramiye alir
        System.out.println(ahmet.izin); // Tum personel yilda 4 hafta izin kullanabilir
        ahmet.maasHesapla();
        ahmet.mesai();

        System.out.println("--------------------------");
        System.out.println("Adem");

        /*
        Bir objeyi hangi class dan tanimlarsak o class a ait ozelliklere sahip olur
         */

        Personel adem = new Ustabasi();
        System.out.println(adem.statu); // Personel
        System.out.println(adem.haklar); // Tum Personel esit haklara sahiptir
        // System.out.println(adem.ikramiye); //... CTE Verir, Personel Class da ikramiye yok
        System.out.println(adem.izin); // Tum personel yilda 4 hafta izin kullanabilir
        adem.maasHesapla();
        adem.mesai();

        /*
        Personel adem = new Ustabasi(); Bu bir ustabasi objesidir
        Personel adem = new Personel(); Bu bir personel objesidir
         */


        /*
        Personel adem = new Ustabasi();

        adem'in data turu Personel'dir
        boylece biz adem'i ne olarak isimlendirdigimizi bilebiliriz
        Ancak ben adem'in Ustabasi oldugunu biliyorum.
        Cunku contructor i Ustabasi()
        Ama bu olusturma formati ile adem'in tum Personel ile birlikte
        sahip oldugu ortak ozellikleri vurgulamak istiyorum.

        Bu kullanim seklinde olusturulan obje data turu olarak secilen class
        ve onun parent class larindaki variable'lari kullanabilir.
         */


    }
}
