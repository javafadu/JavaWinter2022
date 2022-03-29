package day28_constructor;

public class StaticKeyword {
    static int sayi1;
    int sayi2;

    public static void main(String[] args) {

        /* static variable lar direk class a baglidir
            class icerisinde yapilan her turlu degisiklik static
            variable larda kalici olur.

            instance variable lar ise objeye baglidir.
            instance varianle lara sadece obje uzerinden erisilebilir.
            ve bir obje uzerinden erisilerek yapilan degisiklik instance
            varianle in degerini kalici olarak degistirmez sadeec o obje icin
            instance variable degerini kalici olarak degistirir.

         */


        System.out.println("Sayi1: "+sayi1); // 0
       //  System.out.println("Sayi2: "+sayi2);  static olmadigi icin main de kullanamayiz

        StaticKeyword obj1 = new StaticKeyword();
        System.out.println("Sayi2: "+obj1.sayi2); // 0

        sayi1++;
        obj1.sayi2++;
        System.out.println("Sayi1: "+sayi1); // 1
        System.out.println("Sayi2: "+obj1.sayi2); // 1
        System.out.println("Sayi2: "+obj1.sayi1); // 1  boyle de olur onceki gibi de


        StaticKeyword obj2 = new StaticKeyword();
        System.out.println("Sayi2: "+obj2.sayi2); // 0
        System.out.println("Sayi2: "+obj2.sayi1); // 1  (static oldugu icin son hali neyse odur)

        obj2.sayi1++;
        obj2.sayi2++;
        System.out.println("Sayi1: "+obj2.sayi2); // 1
        System.out.println("Sayi2: "+obj2.sayi1); // 2




    }
}
