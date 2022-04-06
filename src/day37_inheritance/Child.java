package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {

    // bir class i Child class yaptigimizda
    // parent class daki constructor'a ulasmasi gerekir.
    // Bu durumda Parent class daki constructor'in
    // access modifier i "public" veya "protected" olmalidir (baska package larda ise)
    // ya da uygun olanidir. Default olursa aynı pakettekiler erisebilir



    Child() {
        super();
        System.out.println("Child class parametresiz constructor");
    }

    Child (int s) {
        // Child class'da tum constructor larin ilk satirina
        // Java'nin yerlestirdigi constructor PARAMETRESIZ dir
        // yani super()
        System.out.println("Child class parametreli cons.");
    }


    Child (int sayi1, int sayi2) {
        // eger parent class dan parametresiz constructor i degil de
        // baska bir constructor i calistirmak istersek
        // bunu Child class daki constructor in ilk satirina yazmaliyiz super(sayi1,sayi2)
        super(sayi1,sayi2);
        System.out.println("iki parametreli constructor");
    }

    public static void main(String[] args) {

        Child child = new Child(5,8);

    }

}
