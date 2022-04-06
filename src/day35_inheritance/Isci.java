package day35_inheritance;

public class Isci extends Personel {
    public static void main(String[] args) {

        // Personel obje si uretiyoruz
        Personel objPersonel = new Personel();
        objPersonel.isim = "Eren";
        objPersonel.soyisim = "Terzioglu";
        objPersonel.adres = "Istanbul Fatih";


        // Isci obje si uretiyoruz
        Isci objIsci = new Isci();
        objIsci.isim = "Huseyin";
        objIsci.soyisim = "Efe";
        objIsci.adres = "Ankara Ulus";


    }
}
