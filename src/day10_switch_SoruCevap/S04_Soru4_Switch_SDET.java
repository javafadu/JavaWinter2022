package day10_switch_SoruCevap;

import java.util.Scanner;

public class S04_Soru4_Switch_SDET {
    public static void main(String[] args) {
        // Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
        //Kullanici S girerse “Software”
        //D girerse “Developer”
        //E girerse “Engineer”
        //T girerse “In Testing” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("SDET kisaltmasindaki harflerden birini yaziniz");
        char harf = scan.nextLine().toUpperCase().charAt(0);

        switch (harf) {

            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Please enter a valid char");


        }
    }
}
