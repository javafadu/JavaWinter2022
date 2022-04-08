package day39_overriding;

public class OverridingChild extends OverridingParent{

    public void method1() {
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {

        /*
        Bir obje olusturulurken data turu ve constructor ayni class dan secilmisse
        Java direk o class a gider, hem variable hem de method icin o class da varsa
        kullanir, yoksa o class in parent larina bakar.
         */

        OverridingChild obj1 = new OverridingChild();   // DataType child, Constructur child
        obj1.method1();  // Child class method1
        obj1.method2();  // Parent class method2

        /*
        Eger daga turu Parent, constructor Child class dan secildi ise
        variable larda yukaridaki sekilde calisma devam eder.
        ANCAK method'lar icin data turunun oldugu class daki method
        Child class tarafindan override edilmis mi diye control etmrmiz gerekir.
        Eger Child class larda bu method override edilmisse
        override eden method calisir.
         */
        OverridingParent obj2 = new OverridingChild();
        obj2.method2(); // Parent class method2
        obj2.method1(); // Child class method1

        OverridingParent obj3 = new OverridingParent();
        obj3.method2(); // Parent class method2
        obj3.method1(); // Parent class method1

    }

}
