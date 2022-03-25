package day21_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        // array i nasil declare ederiz.
        // data turu, array ismi, [] koseli parantez yazarak array declare edilir


        int arr[] = {1, 3, 5};
        int[] arr2 = {1, 3, 5};
        int[] arr3 = {1, 3, 5};

        double arr4[] = {10.1, 0.2, 5.3};

        String arr5[] = {"Ali", "Veli", "Ayse" };

        // assign mecburi mi?
        // Kullanmadan once mutlaka deger atamasi yapmamiz gerekir

        int arr6[];


        // hem declare edip hem de atama yapacaksam nasil yaparim?

        // 1- declare edip = 'in sagina { } icerisine degerleri yazabilirim.
        String arr7[] ={"Ali", "Veli", "Ayse"} ;

        // 2- Icine deger atamadan olusturmak istersek, boyutunu belirlememiz gerekir
        int arr8[] = new int[5]; // java icinde 5 tane default deger olan bir array olusturur
        // [0,0,0,0,0]



    }
}
