package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {

        String isim = "oguzhan";
        String soyisim = "BALKAYA";
        String kKno = "1234567890123456";

        // eger bir method'dan bir islem yapmasi ve yaptigi islemi bize
        // getirmesini istersek return type "void" degil bize getirecegi
        // sonucun data turunde olmalidir

        // bana isim ve soyismin gizlenmis halini getir
        // bekledigim donus String olur.
        String gizlenmisIsimSoyisim =  isimSoyisimGizle(isim,soyisim) ;
        System.out.println(gizlenmisIsimSoyisim);

        String gizlenmisKrediKartiNo = krediKartiGizle(kKno);
        System.out.println(gizlenmisKrediKartiNo);


    }

    private static String krediKartiGizle(String kKno) {
        String yeniKKno = "**** **** **** "+kKno.substring(kKno.length()-4);
        return yeniKKno;
    }

    public static String isimSoyisimGizle(String isim, String soyisim) {

        String yeniIsim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim = soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");

        // ADIM 3: method calisinca sadece birsey mi yazdiracak yoksa
        // bize bir data mi dondurecek buna karar vermektir.
        // Bu soruda gizlenmis isim soyisim dondurmesi istendiginden
        // return type "void" degil "String" sectik ve
        // method un sonuna return edilecek datayi yazdik

        return yeniIsim+" "+yeniSoyisim; // String bir ifade dondurulecek

    }
}
