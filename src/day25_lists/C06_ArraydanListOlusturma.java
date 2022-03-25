package day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydanListOlusturma {
    public static void main(String[] args) {

        // verilen bir array i listeye cevir

        String arr[] = {"A","B","C"};
        List<String> arraydenList = Arrays.asList(arr);



        // Array den List e donusturursek yeni listin uzunlugunu degistiremeyiz
        // dolayisi ile add(), remove(), celar() gibi methodlar calismaz
        // Java Exception olusur.
        System.out.println("19. satirda List: "+arraydenList);
        arr[1]="F";
        System.out.println("21. satirda Array: "+ Arrays.toString(arr));
        System.out.println("22. satirda List: "+arraydenList);



    }
}
