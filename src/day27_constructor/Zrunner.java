package day27_constructor;

public class Zrunner {
    public static void main(String[] args) {

        Z obj1 = new Z("Emre", "Gulser", 44, true);
        System.out.println(obj1); // Isim : Emre, Soyisim : Gulser, Numara : 44


        Z obj2 = new Z("Emre", "Dh", 55);
        System.out.println(obj2); // Isim : Emre, Soyisim : Dh, Numara : 55

        Z obj3 = new Z("Ali", "Deneme", 44);
        System.out.println(obj3);


    }
}
