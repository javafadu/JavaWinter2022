package day20_scope_Arrays;

public class C02_StaticVariables {

    /* instance variable lar objeye bagimlidir ve her obje farkli degerler alabilir
        ornek: ogrenci notlari veya ogretmen branslari gibi
        bir objeye ait bir variable in son degerini bulmak icin sadece o objeyi
        dikkate aliriz

        static variable lar ise class variable olarak tanimlanir ve tum class uyeleri
        icin aynidir.
        Orn: okul ismi, okul mudurunun adi gibi
        Eger static variable in degeri degistirilirse herkes icin degisir
    */

    static String okulIsmi = "Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;



    public static void main(String[] args) {

        System.out.println(okulIsmi); // Yildiz Koleji
        System.out.println(okulNo); // 0 (default 0 dir, class levelde variable olusturuldu sadece)
        okulNo=102;
        System.out.println(okulNo); // 102
        System.out.println(okulAcikMi); // false (default false dir)

        staticMethod(); // 200

        System.out.println(okulNo);

    }

    public static void staticMethod() {

        okulNo=200;
        System.out.println(okulNo);
    }
}
