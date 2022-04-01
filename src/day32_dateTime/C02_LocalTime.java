package day32_dateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C02_LocalTime {

    public static void main(String[] args) {

        LocalTime tm = LocalTime.now();
        System.out.println(tm); // 22:14:30.496461

        // bir islemin ne kadar surede bittigini bulmak istersek
        // islemden once ve sonra birer time objesi olusturup
        // aradaki farki hesaplayabiliriz

        int sayi=0;
        for (int i = 0; i < 100000; i++) {
            sayi+=i;
        }

        LocalTime tmLoopSonrasi = LocalTime.now();
        System.out.println(tmLoopSonrasi); // 22:14:30.501339

        double nano1 = tm.getNano();
        double nano2 = tmLoopSonrasi.getNano();
        System.out.println("Loop Islem Suresi : "+(nano2-nano1)+" nanosaniye");


        // ileri veya geriye gidebiliriz
        System.out.println(tm.plusHours(1000)); // 14:21:44.836981


        // istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturbailiriz

        System.out.println(LocalTime.now());



    }
}
