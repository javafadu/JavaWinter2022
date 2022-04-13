package day43_garbage_abstractClass;

public abstract class C04 {

    /*
    Bir abstract class da abstract veya concrete method lar bulunabilir.
    Child class larin abstract method lari override etmesi MECBURI iken
                      concrete methodlarin override edilmesi OPSIYONEL dir
     */

    public abstract void absMethod();

    public void concreteMethod() {
        System.out.println("C04 concrete method");
    }

    public  static void concreteStaticMethod() {
        System.out.println("C04 concrete static method");
    }


    public static void main(String[] args) {
        /*
        Abstract class lar constructor a sahiptir ancak
        Abstract class lardan obje olusturulamaz.

        Abstract class'lar OBJE BARINDIRMAYAN sadece child
        class lar icin UYULMASI SART OLAN  veya OPSIYONEL
        birakilan OZELLIKLERI tanimladigimiz bir depo class gibidir.
         */

        // C04 obj = new C04();
        // obje üretemiyoruz,

        System.out.println("Bu class abstractir");
        concreteStaticMethod();
    }
}


