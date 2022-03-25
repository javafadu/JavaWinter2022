package day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {


        // string'i yazdiran bir methoda olusturalim
        // hosgeldiniz diyen bir method olusturalim
        // kapanma mesaji yazan bir methoda olusturalim

        hosgeldinYazdir();

    }

    private static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }

    public static void hosgeldinYazdir() {
        System.out.println("Hosgeldin");
        stringYazdir("Java gun gectikce guzellesiyor");
    }

    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
