package day22_arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        // kelimelere bolmek

        String kelimeler[] = str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, gun, gectikce, guzellesiyor]
        System.out.println(kelimeler[1]); // gun

        String gectikce[] = str.split("gectikce");
        System.out.println(Arrays.toString(gectikce)); // [Java gun ,  guzellesiyor] (space ler duruyor)
                                        // [Java gun_, _guzellesiyor] (space ler _ olarak gosterildi)

        String harfler[] = str.split("");
        System.out.println(Arrays.toString(harfler));
        // J, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]

        String deneme[] = str.split(" ",3);
        System.out.println(Arrays.toString(deneme));



    }
}
