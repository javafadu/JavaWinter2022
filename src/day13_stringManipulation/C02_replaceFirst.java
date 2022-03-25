package day13_stringManipulation;

public class C02_replaceFirst {
    public static void main(String[] args) {

        String str = "Feridun Ersen Özçelik 123345 ---** !!!!''22 -**0999    *0 98 8 son";
        // 1: " " :  leri degistirir
        System.out.println(str.replaceFirst("çelik", "*"));

        //  "\\D" : dijit disindaki leri degistirir
        System.out.println(str.replaceFirst("\\D", "*"));

    }
}
