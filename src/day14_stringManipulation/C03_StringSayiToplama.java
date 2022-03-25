package day14_stringManipulation;

public class C03_StringSayiToplama {
    public static void main(String[] args) {
        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String str1 = “$13.99”
        // String str2 = “$10.55”

        String str1 = "$13.99";
        String str2 = "$10.55";

        double price1 = Double.valueOf(str1.substring(1));
        double price2 = Double.valueOf(str2.substring(1));
        System.out.println(str1+" + "+str2+" = "+"$"+(price1+price2));

        // HOCANIN COZUMU
        System.out.println("*****HOCANIN COZUMU******");
        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        double str1Sayi=Double.valueOf(str1);
        double str2Sayi=Double.valueOf(str2);
        double sonuc= (str1Sayi+str2Sayi)/100;
        System.out.println("Verilen String sayilarin toplami : $"+sonuc);



    }
}
