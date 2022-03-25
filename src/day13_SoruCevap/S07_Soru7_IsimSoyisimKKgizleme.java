package day13_SoruCevap;

public class S07_Soru7_IsimSoyisimKKgizleme {
    public static void main(String[] args) {
        // Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
        //yazdirin
        //isim-soyisim : M***** B*******
        //kart no : **** **** **** 1234

        String name = "Fatih Metin Yilmaz";
        String cardNo = "1234 5678 9090 1214";

        // Isim Bilgisini Yazdirma
        int ilkBosluk = name.indexOf(" ");
        int ikinciBosluk = name.lastIndexOf(" ");

        if(ikinciBosluk!=ilkBosluk) {   // Isim Orta Isim ve Soyisim den olusuyorsa
            String ilkIsim = name.substring(0, ilkBosluk);
            String ikiciIsim = name.substring(ilkBosluk + 1, ikinciBosluk);
            String ucuncuIsim = name.substring(ikinciBosluk + 1, name.length());

            System.out.print(ilkIsim.substring(0, 1) + ilkIsim.substring(1).replaceAll("\\S", "*"));
            System.out.print(" " + ikiciIsim.substring(0, 1) + ikiciIsim.substring(1).replaceAll("\\S", "*"));
            System.out.print(" " + ucuncuIsim.substring(0, 1) + ucuncuIsim.substring(1).replaceAll("\\S", "*"));
            System.out.println("");
        }
        else { // sadece isim ve soyisimden olusuyorsa
            String ilkIsim = name.substring(0, ilkBosluk);
            String ikiciIsim = name.substring(ilkBosluk + 1);

            System.out.print(ilkIsim.substring(0, 1) + ilkIsim.substring(1).replaceAll("\\S", "*"));
            System.out.print(" " + ikiciIsim.substring(0, 1) + ikiciIsim.substring(1).replaceAll("\\S", "*"));
            System.out.println("");

        }


       // Kredi Kartini Yazdirma
        String ilkUcGrupGizli = cardNo.substring(0,cardNo.length()-4).replaceAll("\\S","*");
        String sonGrupAcik = cardNo.substring(15,19);
        System.out.println(ilkUcGrupGizli+sonGrupAcik);

    }
}
