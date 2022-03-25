package day13_stringManipulation;

public class C05_Cte_Rte {
    public static void main(String[] args) {

      //  int sayi = "Ali Can";  //syntax hatalarini java yazdigimizda gorur ve altini cize
                                // tum projede alti cizili bir kod varsa
                                // projede hicbir class calismaz


        // CTR : compile time error
        // RTE : run time error
        String str = "Javada hersey zamanla oturur";

        System.out.println(str.substring(5000)); // 
    }
}
