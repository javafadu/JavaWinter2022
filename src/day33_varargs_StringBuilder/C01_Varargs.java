package day33_varargs_StringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {
        // kac tane String verilirse verilsin iclerinden en uzun olani yazdiranbir
        // method  create ediniz

        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Oguzhan";
        String str4 = "Muzaffer";

        // yazilan argument sayisi sabit ise her zamanki gibi bir method olusturabiliriz
        // ancak argument sayisinin degisme ihtimali varsa
        // o zaman varargs tercih edilir

        enUzunKelime(str3,str2,str4);

    }

    private static void enUzunKelime(String... str) {
        String enUzunStr="";

        for (String each : str
             ) {
            if(each.length()>enUzunStr.length()) {
                enUzunStr=each;
            }
        }

        System.out.println("En uzun kelime : "+enUzunStr);

    }


}
