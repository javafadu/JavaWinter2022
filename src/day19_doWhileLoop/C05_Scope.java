package day19_doWhileLoop;

public class C05_Scope {

    // 1- Method icerisinde olusturulan variable lar sadece olusturulduklari
    //    method'da kullanilabilirler, baska method'larda kullanilamazlar.

    // 2- Tum method'larin kullamabilmesini istedigimiz variable'lari
    //    Class Level de olustururz.
    //    Class Level de olusturdugumuz variable'i
    //    --static yaparsak tum methodlar kullanabilir.
    //    --static olmazsa (instance) o zaman sadece static olmayan methodlar kullanabilir

    // 3- Loop icinde olusturulan variable lar loop icerisinde kullanilabilir
    //    ama loop un disinda kullanilamaz.


    static String kurs = "Java";
    int level = 10;
    static int sayi4;


    public static void main(String[] args) {

        int sayi=10;
       // isim="Veli";
        System.out.println(kurs);
       // System.out.println(level);

        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            int loopSayi = 20;
        }
        // System.out.println(i);
        // loopSayi=30;

        int sayi2;
        // sayi2++; main method icinde olusturup deger atamadigim sayiyi artirmama Java izin vermiyor
        sayi4++; // class level olusturup deger atamadigim sayi4 u artirmama Java itiraz etmiyor
    }

    public static void method1() {
      //  sayi=20;
        String isim="Ali Can";
        System.out.println(kurs);
      //  System.out.println(level);
    }

    public void method2() {
      //  sayi=30;
      //  isim ="Ayse";
        System.out.println(kurs);
        System.out.println(level);
    }

}
