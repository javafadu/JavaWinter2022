package day22_arrays;

public class C08_Split {
    public static void main(String[] args) {

        // verilen bir cumlede istenen harfi kac defa kullanildigini yazdiran
        // bir method olusturun

        String cumle = "Nerede o 'hello world' yazdiramayan ogrenciler?";
        String harf="e";

        harfKacDefa(cumle,harf);


    }

    private static void harfKacDefa(String cumle, String harf) {
        int adet = 0;
        String karakterler[] = cumle.split(""); // harflere bolmek icin "" kullandik

        for (int i = 0; i <karakterler.length ; i++) {
            if(karakterler[i].equals(harf)) {
                adet++;
            }
        }
        System.out.println("Aradiginiz harf "+harf +" verilen cumlede "+adet+ " adet kullanilmis");


    }
}
