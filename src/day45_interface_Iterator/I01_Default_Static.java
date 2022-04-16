package day45_interface_Iterator;

public interface I01_Default_Static {

    /*
    Interface lerde sadece abstract method'lar bulunur.
    body'si olan concrete bir method olusturmak istedigimizde
    Java CTE verir.

    Ancak Java8 ve uzeri versiyonlarda, istinai olarak
    static veya default olarak tanimlanan method'larin bodysi olabilir
    ancak burada kullanilan default keywordu access modifirs degildir.
    cunku Interface'lerde tum methodlar public ve abstract'ti

    asagida ornekte oldugu gibi default olarak tanimlanmis
    bir method'a access modifiers olarak public yazabilirsiniz.
    (access modifier yazmasak da Java public olarak kabul edecektir.
     */

    void method1();

    public default void method2() {
        System.out.println("Interface'deki default method");
    }

    static void method3() {
        System.out.println("Interface'deki static method");
    }




}
