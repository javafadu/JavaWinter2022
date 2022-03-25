package day02_variables;

public class C01_Variables {

    public static void main(String[] args) {
        // bir variable olustururken icerisie koyacagimiz datanin alabilecegi degerlere
        // uygun bir data turu secmeliyiz
        // ornegin bir sehr in nufusundan bahsediyorsak
        // variable imizin data turu String, boolean, char veya double olamaz
        // geriye kalan tamsayi turlerinden sehrin nufusunu icine alabilecek buyuklukte
        // bir data turu secebiliriz
        // biz kurs boyunca genelde tamsayilar icin "int", ondalikli sayilar icin "double" kullanacaz

        System.out.println("Hello World yazdiran Javayi halleder");

        int level = 1;

        System.out.println(level);

        //Primitive Data Turleri

        // 1: boolean (1 bit)
        boolean ogrenciMi = true;
        boolean yagisVarmi = false;
        System.out.println(ogrenciMi);

        // 2: char
        char ozelSembol = '&';
        char sayi = '2';
        char harf = 'K';
        System.out.println(harf);

        // 3: byte (8 bit)


        // 4: short (16 bit)


        // 5: int


        // 6: long



        // 7: double (64 bit) virgulden sonra



        // 8: float (64 bit) virgulden sonra 6 karakter, sonuna f yazmak gerekir


        // Non-Primitive Data Turleri

        // 1: String metin ifadesi, isim, cumle,

        // Non-Primitive oldugu icin biz sadece data saklamak degil ekstra bazi
        // ozelliklerini de kullanabiliyoruz.
        // Eger Tc No, telefon, okul no, gibi kendisi sayisal olan ancak matematiksel bir islemde
        // kullanilmayan degerler icin de kullanilabilir.

        String TcNo = "12345678901";
        String HicKarakter ="";

        String harf1= "A";
        char harf2 = 'A';
        // bu ikisi icin de ayni durum gecerli.
        // ben A harfi icin bir variable i char olarak da olusturabilirim, String olarak da
        // Eger sadece saklayacaksak char kullanilabilir, ama
        // String in ozelliklerinden istifade etmek icin String olarak tanimlamak daha avantajli olablir


    }
}
