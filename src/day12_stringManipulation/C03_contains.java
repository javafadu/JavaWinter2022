package day12_stringManipulation;

public class C03_contains {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        String email = "malik@gmail.com.tr";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)) {
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.lastIndexOf(arananMetin)==email.length()-arananMetin.length() ) {
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("Lutfen yazimi kontrol edin");
        }

    }
}
