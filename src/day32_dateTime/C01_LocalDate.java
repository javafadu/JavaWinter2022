package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {

    public static void main(String[] args) {


        LocalDate trh = LocalDate.now(); // obje nin olusturuldugu tarihi trh ye assign eder
        LocalDate baskaTrh = LocalDate.of(1982,03,29);

        // istedigimiz yil ay gun degerlerine gore bize obje olusturur.

        System.out.println(trh); // 2022-03-31

        // get li methodlarla tarihle ilgili detay bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth()); //31
        System.out.println(trh.getDayOfWeek()); // THURSDAY
        System.out.println(trh.getMonthValue()); // 3
        System.out.println(trh.getYear()); // 2022

        // bir tarihten istedigimiz kadar ileri veya geri gidebiliriz
        System.out.println(trh.minusWeeks(20)); // 2021-11-11
        System.out.println(trh.plusMonths(3).plusDays(5)); // 2022-07-05
        System.out.println(trh.plusMonths(9).plusDays(10)); // 2023-01-10

        // Istedigimiz ulkenin o andaki tarihini elde etmek istersek
        LocalDate trhZone = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);  // 2022-04-01

        // is ile baslayan methodlar true false doner
        System.out.println(LocalDate.now().isLeapYear()); // false
        System.out.println(trh.isAfter(baskaTrh)); // true








    }
}
