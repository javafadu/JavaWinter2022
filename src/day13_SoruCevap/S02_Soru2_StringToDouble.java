package day13_SoruCevap;

public class S02_Soru2_StringToDouble {
    public static void main(String[] args) {
        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String str1 = “$13.99”
        // String str2 = “$10.55”

        String str1 = "$13.99";
        String str2 = "$10.55";

        double price1 = Double.valueOf(str1.substring(1));
        double price2 = Double.valueOf(str2.substring(1));
        System.out.println(str1+" + "+str2+" = "+"$"+(price1+price2));

        String sayi1 = "12.40";
        String sayi2 = "35.67";
        // System.out.println(Double.valueOf(sayi1) + Double.valueOf(sayi2));
        System.out.println(Double.parseDouble(sayi1) + Double.parseDouble(sayi2));


    }
}
