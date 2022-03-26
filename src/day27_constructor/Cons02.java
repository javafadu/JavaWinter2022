package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {
        Cons01 obj1 = new Cons01(); // default
        /* Cons01 class inda hic constructor olusturmazsak,
        Java default constructor i kullandigindan obj1 i uretebildik

        Ancak biz paramtereli veya parametresiz bir constructor yazdigimizda
        Java default constructor i siler.

        Dolayisi ile biz herhangi bir constructor olusturdugumuzda
        daha once baska class lar veya kullanicilarin
        olusturmus olabilecegi objeleri kullanabilmeleri icin
        default constructor islevini gerceklestirecek
        parametresiz bir constructor olusturmakta fayda var.


        */

        Cons01 obj2 = new Cons01("Java");

    }
}
