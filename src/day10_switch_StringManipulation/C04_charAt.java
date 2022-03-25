package day10_switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {

        // String'de herhangi bir karakteri almak istedigimizde
        // o karakterin index ini kullanarak
        // str.charAt(istenen index) yazabiliriz

        String str = "Java Cok Guzel";
        // J yi yazdiralim
        System.out.println(str.charAt(0)); // J
        // G yi yazdiralim
        System.out.println(str.charAt(9)); // G
        // va yazdiralim
        System.out.println(""+str.charAt(2)+str.charAt(3)); // va

        // cOK seklinde yazdiralim
        System.out.println(""+str.toLowerCase().charAt(5)+str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7));

        // Son harfi yazdir
        // String de 14 harf var, dolayisi ile son karakterin indexi
        // 14-1 = 13 olur (0 dan basladigi icin)
        System.out.println(str.charAt(14-1)); // uzunluk -1

    }
}
