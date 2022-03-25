package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str = "Bugun ne cok sey ogrendik";

        // bu cumlede bosluk disindaki karakter sayisini bulunur
        // bosluklari silip tum cumleyi birlestirip length alabiliriz

        System.out.println("space haric karakter sayisi :" +str.replace(" ", "").length()); // 21

        // atama yapilmadigi surece orjinal String kalici olarak degismez
        // sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur

        System.out.println("orjinal str karakter sayisi: "+str.length());


        // str da kalici degisiklik yapalim
        // bugun yerine yarin yazdiralim
        // ogrendik yerine ogrenecegiz yazdiralim

        str =str.replace("Bugun", "Yarin");
        str = str.replace("ogrendik", "ogrenecegiz");
        System.out.println("Kalici Degisiklik sonrasi str :"+str);

        str.replace("ne cok", "ne az");
        // atama yoksa kalici degisiklik de yok
        System.out.println(str);


    }
}
