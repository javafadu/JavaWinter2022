package day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari
        // ve toplam kac tane olduklarini ekranda yazdirin

        int input=30;

        // for loop ile de yapabiliriz ama biz while loop ile yapalim
        int sayac=0;
        int bolen=1;
        while(bolen<=input) {

            if(input%bolen==0) {
                System.out.print(bolen+" ");
                sayac++;

            }
            bolen++;
        }
        System.out.println();
        System.out.println("Toplam : "+sayac);
    }
}
