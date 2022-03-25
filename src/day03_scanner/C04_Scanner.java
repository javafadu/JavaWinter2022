package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // Scanner kullanmak icin 3 adim takip ediyoruz
        // ADIM 1 : kendimize 1 scanner olusturmak

        Scanner scan = new Scanner(System.in); // Esitligin saginda yeni bir Scanner olusturulur
                                                // Olusturulan bu scanner scan variable assign edilir
                                                // scan variable in ismidir, istedigimiz ismi verebiliriz

        // ADIM2 : kullanicidan istedigimiz degeri girmesi icin aciklayici bir bilgi yazdirin
        System.out.println("Lutfen isminizi giriniz");

        // ADIM3 : kullanicinin girdigi degeri uygun bir variable olusturup kaydedin

        // String kullaniciIsmi = scan.next(); // SADECE ilk kelimeyi alır, Ilk sapce a kadar
        String kullaniciIsmi = scan.nextLine(); // butun satiri sonuna kadar girileni alir

        System.out.println("Kullanicinin Girdigi Isim: "+kullaniciIsmi);
    }
}
