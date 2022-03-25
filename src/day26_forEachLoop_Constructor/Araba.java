package day26_forEachLoop_Constructor;

public class Araba {
    /* Java'da her Class olusturdugumuzda
        Java o Class'dan ileride objeler uretmek gerekecegini bilir
        ve biz ozellikle belirtmesek de Java
        her olusturdugu class'a bir constructor koyar

        Java'nın Class olustururken class'a koydugu constructor a
        DEFAULT CONSTRUCTOR denir ve bu constructor gorunmez.

        Eger biz gorunur bir constructor olsun istersek
        default constructor ile ayni gorevi yapan bir constructor olusturabiliriz.
        veya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin
        farkli ozelliklerde constructorlar da olusturabiliriz.

        constructor lari birbirinden farklilastiran tek ayricalik kullanilan paramtetre sayisi
        ve parametre data turudur.

     */

    public Araba() {
        System.out.println("parametresiz constructor calisti");
    }

    // bir kod blogunun method veya constructor olmasindan emin olmak istersek
    // iki seye dikkat etmeliyiz :
    // 1- Constructor larin ismi class ismi ile ayni olmak zorundadir, buyuk harfle baslar
    // 2- Constructor larin return type lari olmaz

    // Ozetle: constructor in adi class adi ile ayni olmali ve
    // return type olmamali


    public  Araba(String renk) {
        System.out.println(renk + " renkli bir araba uretildi");
    }

    public Araba(int yil) {
        System.out.println(yil + " model bir araba uretildi");
    }

    public Araba(int yil, String renk) {
        System.out.println(yil + " model "+renk+ " renginde bir araba uretildi");
    }

}
