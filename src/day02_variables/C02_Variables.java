package day02_variables;

public class C02_Variables {

    public static void main(String[] args) {

        // Java calismaya main method dan baslar
        // sonra yukaridan asagi, soldan saga dogru calisir


        // eger istersek bir variable once declare edip sonra assign yapabiliriz

        String OkulIsmi;

        // Java deger atamasi yapmadigimiz bir variable olusturmamiza itiraz etmez
        // ancak deger atamasi yapincaya kadar o variable i kullanmamiza izin vermez
        // System.out.println(OkulIsmi);

        OkulIsmi = "ABC Koleji";
        System.out.println(OkulIsmi);

        // println ile print arasindaki fark:
        // println yazdirdiktan sonra alt satira gecer
        // print yazdirma isleminden sonra alt satira gecmez oldugu yerden devam eder
        OkulIsmi = "XYZ Koleji";
        System.out.print(OkulIsmi);

        OkulIsmi ="Java Koleji";
        System.out.print(OkulIsmi);

    }


}
