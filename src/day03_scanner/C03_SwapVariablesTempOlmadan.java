package day03_scanner;

public class C03_SwapVariablesTempOlmadan {
    public static void main(String[] args) {
        //1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        //Orn : sayi1=10 ve sayi2=20; kod calistiktan sonra
        //sayi1=20 ve sayi2=10

        // 2- Verilen sayi1 ve sayi2 variable’larinin degerlerini
        // 3.bir variable olmadan degistiren (SWAP) bir program yapiniz

        int sayi1 = 10;
        int sayi2 = 20;
        System.out.println("Swaptan Once Sayi1 ="+sayi1 + " sayi2: "+sayi2);

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("Swaptan Sonra Sayi1 ="+sayi1 + " sayi2: "+sayi2);
    }
}
