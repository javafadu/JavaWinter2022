package day07_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if(a<b && b<100) {
            System.out.println("isteginiz gerceklesecek");
            System.out.println("Body icindeki tum kodlar calisir");
        }

        if(a>0)
            System.out.println("Suslu parantez olmazsa sadece bir satir calisir");
        // bir if cumlesinin daha anlasilir olmasini istiyorsaniz
        // if body sini suslu parantez icine yazmalisiniz
        // body yi suslu parantez icine yazmazsak da if cumlesi calisir
        // ancak ilk noktali virgul gordugunde if cumlesi bitmis olur

        //21. satir bagimsizdir.
        System.out.println("Ikinci satir da calisti");


    }
}
