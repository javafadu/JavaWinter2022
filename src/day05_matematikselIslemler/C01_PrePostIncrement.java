package day05_matematikselIslemler;

public class C01_PrePostIncrement {
    public static void main(String[] args) {

        int sayi = 10;
        // bu sayiyi 1 artirmak istersek
        sayi++;
        System.out.println(sayi); // 11

        sayi++;
        System.out.println("Pre-incrementten once "+ sayi); // 12

        // Eger 11. ve 12. satirda yaptigim 2 islemi tek satirda yaparsam
        // java iki islemden once hangisinin yapilmasini bilmek ister
        // once artirir sonra yazdirirsak java yeni degeri yazdirir
        // ama once yazdirir sonra artirirsak, bu durumda eski deger yazdirilir

        System.out.println("Pre-increment satirinda "+ ++sayi); // 13 once artir, sonra yazdir
        System.out.println("Pre-incrementten sonra "+ sayi); // 13


        System.out.println("Post-increment satirinda "+ sayi++ ); // 13 once yazdir sonra artir
        System.out.println("Post-incrementten sonra "+ sayi); //14
    }
}
