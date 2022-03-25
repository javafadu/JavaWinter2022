package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {
        // verilen iki harf ve aralarindaki harfleri yazdiran
        // bir kod yaziniz

        char ilkHarf = 'c';
        char sonHarf = 's';

        for (char i=ilkHarf; i<=sonHarf; i++){
            System.out.print(i+ " ");
        }

        double baslangic = 10.00;
        double bitis = 20.00;
        double artis = 0.20;
        //baslangic ve bitis sayilari arasinda artis miktari ile oluscak
        //tum sayilari yazin

        for (double i = baslangic; i <= bitis; i+=artis) {
            System.out.print(i+ " ");
        }


    }
}
