package day04_dataCastingIncrement;

public class C05_IncrementDecrement {
    public static void main(String[] args) {
        // 3 sekli vardir
            // sayi1 = sayi1 + 3;
            // sayi1 += 3; (genelde bu tercih edilir)
            // sayi1++; (sadece 1 artirip, azaltacaksak bunu kullaniriz)


        int num=20;
        System.out.println(num+10); // 30 bu satida sayinin 10 fazlasini YAZDIRDIM
        System.out.println(num); // 20
        // eger assign etmezsek sayida yaptigimiz artirma veya azaltma kalici olmaz

        num = num+10;
        System.out.println(num); // 30

        System.out.println(num=num+=10); // 40
        System.out.println(num); // 40

        System.out.println(num+=10); //50
        System.out.println(num); // 50

        // bir variable in degerini kalici olarak artirmak veya azaltmak istersek
        // = assignment sart

        System.out.println("23. satir: "+num++);
        System.out.println("24. satir: " +num);

        System.out.println("26. satir: "+ ++num);
        System.out.println("27. satir: " +num);



    }
}
