package day05_matematikselIslemler;

public class C02_PrePostIncrement {
    public static void main(String[] args) {

        int a=15;
        int b=a+1; // once assign et sonra artir (b=15, a=15+1-> 16)
        System.out.println(b); // 15

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;

        sayi2 = sayi1++; // once sayi2 ye deger atanacak, sonra sayi1 artirilacak,
        System.out.println(sayi1+ "," + sayi2 + ","+sayi3); // 11, 10, 30

        sayi3 = ++sayi1; // once artirma, sonra atama yapilacak
        System.out.println(sayi1+ "," + sayi2 + ","+sayi3); // 12, 10, 12

        System.out.println(sayi3++); // once yazdiracak, sonra artiracak
                                    // once 12 yazdiracak, sonra sayi3=13 olacak

        System.out.println(--sayi2); // once azaltacak, sonra yazdiracak
                                    // sayi once azaltir 10-1 = 9, sonra yazdir


    }
}
