package day18_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        char harf1='A';
        char harf2='F';

        for (char i = harf1; i <=harf2 ; i++) {
            for (char j = harf1; j <=i ; j++) {
                System.out.print(j);

            }
            System.out.println("");

        }
    }
}
