package day13_SoruCevap;

public class S01_Soru1_Replace {
    public static void main(String[] args) {
        /*
        String methodlarini kullanarak
        “ Java ogrenmek123 Cok guzel@ ” String’ini
        “Java ogrenmek cok guzel.” sekline getirin.
         */

        String str = "Java ogrenmek123 Cok guzel@";             // String in ilk hali
        System.out.println("str nin ilk hali : "+str);
        str = str.charAt(0)+str.substring(1,str.length()-1).toLowerCase();     // Ilkini al,
                                                                // Ilk ve son haric lowercase yap ekle
        System.out.println("str nin ikinci hali : "+str);
        str=str.replaceAll("\\d","");           // rakamlari kaldiralim
        System.out.println("str nin ucuncu hali : "+str);

    }
}
