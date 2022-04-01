package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {

    LocalDate bugun = LocalDate.now();
    LocalDate dogumGunu = LocalDate.of(1982,03,29);


        System.out.println(Period.between(dogumGunu,bugun)); // P40Y2D
        // P : period
        System.out.println(Period.between(dogumGunu,bugun).getYears()); // 40

        // FIXME : 3/31/2022


    }
}
