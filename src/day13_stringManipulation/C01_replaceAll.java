package day13_stringManipulation;

public class C01_replaceAll {
    public static void main(String[] args) {

        String str = "Feridun Ersen Özçelik 123345 ---** !!!!''22 -**0999    *0 98 8 son";

        // Regular Expressions
        // 1: "\\s" : space leri degistirir
        System.out.println(str.replaceAll("\\s", "*"));

        // 2: "\\S" : space olmayanlari degistirir
        System.out.println(str.replaceAll("\\S", "*"));

        // 3: "\\w" : harf ve rakamlar olanlari degistirir
        System.out.println(str.replaceAll("\\w", "*"));

        // 4: "\\W" : harf ve rakamlarin disindakileri  degistirir
        System.out.println(str.replaceAll("\\W", "*"));

        // 5: "\\d" : dijitleri (rakamlari)  degistirir
        System.out.println(str.replaceAll("\\d", "*"));

        // 6: "\\D" : dijit (rakam) disindakileri  degistirir
        System.out.println(str.replaceAll("\\D", "*"));
    }
}
