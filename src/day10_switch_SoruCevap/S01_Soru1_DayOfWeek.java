package day10_switch_SoruCevap;

import java.util.Scanner;

public class S01_Soru1_DayOfWeek {
    public static void main(String[] args) {
        // Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a day number of week");
        int dayOfWeek = scan.nextInt();

        switch (dayOfWeek) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a valid day number");
        }

    }
}
