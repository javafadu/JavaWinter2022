package day27_constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {

        // her obje olusturdugumuzda model, yakit gibi degerleri
        // tek tek atama yapmak istemiyorsak

        Volvo arb1 = new Volvo("XC60", false, 2023, "Benzin");
        System.out.println(arb1.toString()); // Model : XC60 Yakit : Benzin Max Hiz : 240

        System.out.println(arb1);

        Volvo arb2 = new Volvo("XC90", true, 2021, "Elektrikli");
        System.out.println(arb2);

    }
}
