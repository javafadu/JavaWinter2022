package day16_methodCreation;

public class C01_MethodIleSifreKontrol {
    public static void main(String[] args) {
           /*
        Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
            basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir
            sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */
        // bu dort kontrolu method ile yapin

        String sifre = "abc1 234A";

        boolean ilkHarfKontrol = ilkHarfKontrolEt(sifre);
        boolean sonHarfKontrol = sonHarfKontrolEt(sifre);
        boolean boslukKontrol = boslukKontrolEt(sifre);
        boolean uzunlukKontrol = uzunlukKontrolEt(sifre);

        if(ilkHarfKontrol && sonHarfKontrol && boslukKontrol && uzunlukKontrol) {
            System.out.println("Sifreniz basarili bir sekilde tanimlandi");
        } else {
            System.out.println("Islem basarisiz, lutfen yeni bir sifre giriniz");
        }
    }

    private static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonuc = false;
        if (sifre.length()>=8) {
            uzunlukKontrolSonuc = true;
        } else {
            System.out.println("Sifreniz en az 8 karakter olmalidir");
        }
        return uzunlukKontrolSonuc;
    }

    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc = false;
        if(!sifre.contains(" ")) {
            boslukKontrolSonuc=true;
        } else {
            System.out.println("Sifre bosluk icermemeli");
        }
        return boslukKontrolSonuc;
    }

    private static boolean sonHarfKontrolEt(String sifre) {
        boolean sonHarfSonuc = false;
        char sonHarf = sifre.charAt(sifre.length()-1);
        if(sonHarf >='a' && sonHarf<='z') {
            sonHarfSonuc = true;
        } else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
        }
        return sonHarfSonuc;
    }

    private static boolean ilkHarfKontrolEt(String sifre) {
        char ilkHarf = sifre.charAt(0);
        boolean ilkHarfSonuc = false;

        if(ilkHarf>='A' && ilkHarf<='Z') {
            ilkHarfSonuc = true;
        } else {
            System.out.println("Sifrenizin ilk harfi buyuk harf olmali");
            // ilkHarfSonuc = false;
        }

        return ilkHarfSonuc;
    }

}
