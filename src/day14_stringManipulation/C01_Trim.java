package day14_stringManipulation;

public class C01_Trim {
    public static void main(String[] args) {
        String str="  Siz ne derseniz deyin Java bildigini okur  ";
        str.trim();
        System.out.println("Length : "+str.length());
        System.out.println(str); // trim yapmadan yazar, atama yok

        str=str.trim();
        System.out.println("Length : "+str.length());
        System.out.println(str); // trim yapar, atama var


    }

}
