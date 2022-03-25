package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {
        // Concatenation yapmak icin iki opsiyonumuz var
            // daha once yaptigimiz gibi + operatorunu kullanabiliriz
            // String class'indan gelen concat methodunu kullanabiliriz

        String str1 = "Java";
        String str2 = "Candir";

        // Java Candir yazdiralim
        System.out.println(str1 + " " + str2);

        String cumle = str1.concat(str2); // JavaCandir
        System.out.println(cumle);

        cumle = str1.concat(" ").concat(str2); // Java Candir
        System.out.println(cumle);

        // concat methodu icine String parametre ister
        // String disinda birsey olursa onu once String hale getirmek gerekir

    }
}
