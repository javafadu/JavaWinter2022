package day45_interface_Iterator;

public class C02_Default_Static_Method implements I01_Default_Static {

    /*
    Bir interface de default veya static olarak tanimlanan ve body'si olan
    methodlarin override edilmesi mecburi degildir.
    Eger static olarak tanimlanmissa zaten override edilemez
     */


    @Override
    public void method1() {
        System.out.println("child class method1");
    }

    public static void main(String[] args) {

        I01_Default_Static.method3();  // static method a interface ismi .method olarak ulasabiliriz
        C02_Default_Static_Method obj = new C02_Default_Static_Method();
        obj.method1();  // child class indaki calisir (data type child, constructor child)
        obj.method2();  // parent class daki calisir (child da yok, parent da var override edilmemis)
        // obj.method3(); eski class larda static bir uyeye static olmayan yollarla
        // ulasabiliyorduk.
        // ancak interface icerisinde static olarak tanimlanan
        // method a obje olusturarak ulasilamaz. Interface adi.method adi olarak cagirabiliriz


    }

}
