package day33_varargs_StringBuilder;

public class C02_Varargs_farkliParametreler {
    public static void main(String[] args) {

        // parametre olarak bir int,
        // ve istedigimiz kadar String alan
        // en uzun kelimenin harf sayisi ile int parametre degerini
        // carpip sonucu yazdiran bir method olusturun.

        int sayi = 5;
        String str1 = "Zulal";
        String str2 = "Zeynep";
        String str3 = "Muzaffer";

        carpim(sayi,str1,str2, str3);
        // carpim(str1, str2, str3, sayi);
        // sirasi method daki gibi olmadigi icin hata verir

        // bir method da varargs disinda parametre kullanacaksak once diger parametreleri yazilir
        // varargs en sona (en saga) yazilir.
        // bu sebeple birden fazla varargs OLAMAZ.

    }

    private static void carpim(int sayi, String... str) {
        String enUzunStr="";
        for (String each : str
        ) {
            if(each.length()>enUzunStr.length()) {
                enUzunStr=each;
            }
        }
        System.out.println("Istenen deger : "+enUzunStr.length()*sayi);
    }

}
