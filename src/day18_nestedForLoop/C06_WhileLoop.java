package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan iki tam sayi alip,
        // bu sayilari ve aralarindaki tum tam sayilari yazdiran
        // bir kod olusturun

        int baslangic = 40;
        int bitis = 60;

        System.out.println("Asagisi for loop ile yapildi");

        for (int i = baslangic; i <= bitis; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");

        // while loop ile yapalim
        System.out.println("Asagisi while loop ile yapildi");
        int i = baslangic;
        while (i<=bitis) {
            System.out.print(i+ " ");
            i++;
        }
        System.out.println("Baslangic degeri : "+baslangic);
    }
}
