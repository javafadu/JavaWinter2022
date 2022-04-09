package day40_overriding_polymorphism;

import java.util.Scanner;

public class C03_ExceptionsTryCatch {
    public static void main(String[] args) {

        // kullanicidan 2 sayi alip, bolerek
        // sonucu yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        int kontrol = 0;
        while(kontrol !=2) {

            System.out.print("Bolmek istediginiz sayiyi yaziniz: ");
            int sayi1 = scan.nextInt();

            System.out.print("Kaca bolmek istediginizi yaziniz: ");
            int sayi2 = scan.nextInt();

            try {
                System.out.println("Sonuc = "+sayi1/sayi2);
            } catch (Exception e) {
                e.printStackTrace();
                // System.out.println("Girdiginiz sayilarda sorun var");
            }

            System.out.println("Devam etmek icin 1, \nBitirmek icin 2 ye basiniz");
            kontrol=scan.nextInt();

        }


        /*
        sayi2 0 oldugunda sayi1 / 0 tanimsiz olacagindan
        Java bu durumla karsilasinca exception verir.
        Javanin yazdigi mesajda exception ne tur bir sorun oldugu neden kaynaklandigini
        ve hangi satirda oldugunu gosterir.
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at day40_overriding_polymorphism.C03_Exepcitions.main(C03_Exepcitions.java:18)

	    bunu cozmek icin sayiyi if ile kontrol edebiliriz.
         */
    //    if(sayi2==0) {
    //        System.out.println("Sayi / 0 tanimsizdir");
    //    } else {
    //        System.out.println("Sonuc = "+sayi1/sayi2);
    //    }
//

    }
}
