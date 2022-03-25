package day23_multiDimensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {

        // boyutlari belirli bir array i elementleri girmeden olusturalim

        // bir okulda icinde 24 ogrenci olan 8 sinir vardir.
        int arr[][] = new int[8][24];

        // bir ilcede herbidinde 24 ogencilik 8 sinif bulunan 5 okul vardir
        int ilce[][][] = new int[5][28][24];

        // bir okulda 3 tane 24 kisilik, 2 tane de 22 kisilik sinir vardir
        int sinif24[][] = new int[3][24];
        int sinif22[][] = new int[2][22];

        // olustururken elementleri arama yaparsak farkli uzunlukra inner lar taninlayabliriz
        int arr1[][] = {{3,1,7,5},{6,10}}; // inner1 4 uzunlukta, inner2 2 uzunlukta

    }
}
