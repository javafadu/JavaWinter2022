package day14_stringManipulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {
        // Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
        //yazdirin
        //isim-soyisim : M***** B*******
        //kart no : **** **** **** 1234

        String isim = "oguzhan";
        String soyisim = "BALKAYA";
        String kKno = "1234567890123456";

        String yeniIsim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim = soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");

        String yeniKKno = "**** **** **** "+kKno.substring(kKno.length()-4);

        System.out.println("Isim-Soyisim : "+yeniIsim+" "+yeniSoyisim);
        System.out.println("kart no : "+yeniKKno);
    }

}
