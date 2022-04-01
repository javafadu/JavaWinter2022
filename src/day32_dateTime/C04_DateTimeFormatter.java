package day32_dateTime;
/*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati
         h  : 12 saat dilimine gore tek rakam olan tek yazilir
         hh : 12 saat dilimine gore tek rakamlara 0 ekler onune
         m  : dakika tek rakamlari yazar (minute)
         mm : dakika tek rakamlarin onune 0 koyar, 01,02,03 gibi
         a yazarsak AM veya PM degerini yazar


         */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

    public static void main(String[] args) {
        // TARIH FORMATLA
        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); // 2022-03-31T22:39:29.232401

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/YYYY");
        System.out.println(formatter.format(tarihSaat)); // 31/Mar/2022

        // SAATI FORMATLAR
        DateTimeFormatter formatterSaat = DateTimeFormatter.ofPattern("hh : mm : ss a");
        System.out.println(formatterSaat.format(tarihSaat));
        // HH : mm -> 22 : 52
        // hh : mm -> 10 : 52
        // hh : mm -> 10 : 52 PM
        // hh : mm : ss -> 10 : 52 : 14 PM





    }
}
