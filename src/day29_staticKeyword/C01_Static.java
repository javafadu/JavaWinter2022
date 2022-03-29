package day29_staticKeyword;

public class C01_Static {

    String okulIsmi = "Yildiz Koleji";
    static String okulTelefonu = "3122562625";

    public static void staticMethod() {
        System.out.println("Static method calisti");
    }

    public void staticOlmayanMethod() {
        System.out.println("Statik olmayan method calisti");
    }


}
