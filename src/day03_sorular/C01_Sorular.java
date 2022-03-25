package day03_sorular;

import java.util.Locale;
import java.util.Scanner;

public class C01_Sorular {
    public static void main(String[] args) {

        // 1: Kullanicidan iki tamsayi alip bu sayilarin toplam, fark ve carpimlarini yazdir
        Scanner scan = new Scanner(System.in);
        System.out.println("Islem yapacaginiz 2 tam sayi giriniz");
        int tamsayi1 = scan.nextInt();
        int tamsayi2 = scan.nextInt();

        System.out.println("Sayilarin Toplami : "+(tamsayi1+tamsayi2));
        System.out.println("Sayilarin Farki : " +(tamsayi2-tamsayi1));
        System.out.println("Sayilarin Carpimi : " +(tamsayi1*tamsayi2));

        // 2: Kullanicidan karenin bir uzunlugunu alin ve karenin alani ve cevresini hesaplayin
        System.out.println("Kardenin bir kenar uzunlugunu girin");
        double kareKenar = scan.nextDouble();
        System.out.println("Karenin Alani : " +kareKenar*kareKenar);
        System.out.println("Kardenin Cevresi : "+ (kareKenar*4));

        // 3: Kulanicidan yaricap isteyip cemberin cevresi ve dairenin alanini hesaplayin
        System.out.println("Dairenin yaricapini giriniz");
        double yaricap = scan.nextDouble();
        System.out.println("Cemberin cevresi : " + (2*3.14*yaricap));
        System.out.println("Dairenin Alani : "+ (3.14*yaricap-yaricap));

        // 4: Kullanicidan dikdortgenler prizmasinin uzun ve kisa kenarlarini ve yuksekligini isteyin
        //  prizmanin hacmini bulun
        System.out.println("Dikdortgenler prizmasinin kisa kenar, uzun kenar ve yuksekligini giriniz");
        double kisaKenar = scan.nextDouble();
        double uzunKenar = scan.nextDouble();
        double yukseklik = scan.nextDouble();
        System.out.println("Dikdortgenler Prizmasinin Hacmi : " + (uzunKenar*kisaKenar*yukseklik));

        // 5: Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //  Isminiz : Mehmet
        // Soyisminiz : Bulutluoz
        // Kursumuza katiliminiz alinmistir, tesekkur ederiz.
        System.out.println("Isminizi Giriniz : ");
        String isim = scan.nextLine();
        System.out.println("Soyisminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println("Isminiz : "+isim);
        System.out.println("Soyisminiz : "+soyisim);
        System.out.println("Kursumuza katiliminiz alinmistir, tesekkur ederiz");

        // 6: Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olup asagidaki gibi yazdirin
        // Isim - soyisim : Mehmet Bulutluoz

        System.out.println("Isminizi giriniz");
        String isim2 = scan.nextLine();
        System.out.println("Soyisminizi giriniz");
        String soyisim2 = scan.nextLine();
        System.out.println("Isim - soyisim : "+isim2+" "+soyisim2);


        // 7: Kullanicidan ismini isteyip isminin bas harfini yazdirin
        System.out.println("Isminizi Giriniz");
        String isim3 = scan.nextLine();
        char ilkHarf = isim3.toUpperCase().charAt(0);
        System.out.println(ilkHarf);

        scan.close();
    }
}
