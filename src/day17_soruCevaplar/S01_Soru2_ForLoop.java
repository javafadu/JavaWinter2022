package day17_soruCevaplar;

public class S01_Soru2_ForLoop {
    public static void main(String[] args) {
        // Soru 2 ) 10 ile 30 arasindaki(10 ve 30 dahil)
        // sayilari aralarinda virgul olarak ayni satirda yazdirin

        for (int i=10; i<=30; i++) {
           String sonuc = i<30?   i+"," : ""+i;
            System.out.print(sonuc);
        }
    }
}
