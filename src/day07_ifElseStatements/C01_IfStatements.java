package day07_ifElseStatements;

public class C01_IfStatements {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (a == b) {
            System.out.println("verilen sayilar esit");
        }

        if (a > 100) {
            System.out.println("a 100 den buyuktur");
        }

        if (a * b > 5) {
            System.out.println("sayilarin carpimi 5 den buyuktur");
        }

        if (a - b > 0 && a * b > 0) {
            System.out.println("and cumlesi calisti");
        }

    }
}
