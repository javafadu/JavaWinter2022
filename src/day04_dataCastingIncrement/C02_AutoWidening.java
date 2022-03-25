package day04_dataCastingIncrement;

public class C02_AutoWidening {
    public static void main(String[] args) {

        // byte veri turundan bir variable olusturup deger atayin
        //olusturulan variable i adim adim AUTO WIDENING ile genisletip yazdirin

        byte numByte =34;

        System.out.println("byte Variable Degeri: " + numByte);

        //short yapalim
        short numShort = numByte; // esitligin solu short, sagi ise byte
        //short byte dan buyuk oldugu icin Java sikayet etmiyor
        // AUTO WIDENING ile degeri short variable a atiyor
        System.out.println("short Variable Degeri: " + numShort);

        //int yapalim
        int numInt = numShort;
        System.out.println("int Variable Degeri: " + numInt);

        //float yapalim
        float numFloat = numInt;
        System.out.println("float Variable Degeri: " + numFloat);

        //double yapalim
        double numDouble = numFloat;
        System.out.println("double Variable Degeri: " + numDouble);

    }
}
