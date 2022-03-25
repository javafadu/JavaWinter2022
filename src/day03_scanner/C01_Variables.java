package day03_scanner;

public class C01_Variables {
    public static void main(String[] args) {


        // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
        String okulIsmi = "Yildiz Koleji";
        System.out.println(okulIsmi); // Yildiz Koleji

        char ilkHarf;
        ilkHarf = 'K';
        System.out.println(ilkHarf);

        int sayi1=10, sayi2=20;
        System.out.println(sayi1+sayi2); // 30

        // 2- isim ve soyisim icin 2 variable olusturun

        String isim = "Nezir";
        String soyisim = "Yildiz";
        System.out.println("Isminiz : "+isim);
        System.out.println("Soyisminiz : "+soyisim);


        // 3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
        int sayi3 = 10;
        int sayi4 = 20;
        System.out.println("Sayilarin Toplami ="+(sayi3+sayi4));

        // 4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
        int sayi5 = 30;
        double sayi6 = 10.5;
        System.out.println("Sayilarin Toplami ="+(sayi5+sayi6));

        // 5 – char data turunde bir variable olusturun ve yazdirin
        char harf = 'C';
        System.out.println(harf);


        // 6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
        System.out.println(sayi5+harf);
        // char data turunde degiskenler matematiksel islemlerde kullanilirse
        // o char degerinin ASCII karsiligi isleme alinir

        int sayi7='#';
        System.out.println(sayi7);




    }
}
