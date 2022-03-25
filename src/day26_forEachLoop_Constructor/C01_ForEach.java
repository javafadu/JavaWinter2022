package day26_forEachLoop_Constructor;

public class C01_ForEach {
    public static void main(String[] args) {

        int arr[] = {2,4,6,8,11};

        // elementleri for loop ile yazdiralim

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("");

        // for-each loop ile yapacak olursak
        // for-each loop calistirmak icin hedef bir collection vermeliyiz

        for (int each :arr
             ) {
            System.out.print(each + " ");
        }

        // AVANTAJ : index, baslangiz, bitis gibi detaylarla ugrasilmaz,
        // collections dan tum elementleri bize getirir

        // DEZAVANTAJ : index e bagli bir islem yapamayiz


    }
}
