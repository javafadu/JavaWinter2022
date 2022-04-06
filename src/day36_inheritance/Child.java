package day36_inheritance;

public class Child extends Parent {


    Child () {
        // super(); biz gormesek de bu var ve parent i cagiriyor
        System.out.println("Child constructor calisti");
    }

    // Tum class larda biz gormesek bile
    // Java nin olusturdugu default constructor vardir.

    // extends keyword kullanan classlardaki CONSTRUCTOR larin ilk satirinda
    // biz gormesek bile super()
    // constructor call vardir.
    // yani parent class in parametresiz constructor call

    public static void main(String[] args) {

        Child child = new Child();


    }

}
