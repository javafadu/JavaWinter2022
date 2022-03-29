package day30_passByValue;

public class C02_StaticBlocks {

    {
        /*
        static olmayan block lar obje olusturulurken calisir.

        static block lar sadece 1 kere en basta calisir ama
        static olmayan block lar her obje olusturulurken yeniden calisir.
         */
        System.out.println("static olmayan block calisti");
    }

    static {
        System.out.println("static block calisti");
    }

    public static void main(String[] args) {

        System.out.println("main method basi");

        C02_StaticBlocks obj1 = new C02_StaticBlocks();
        C02_StaticBlocks obj2 = new C02_StaticBlocks();


    }



}
