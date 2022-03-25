package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        // Kullanicidan yasini isteyin
        // 65 veya daha buyukse "emekli olabilirsin"
        // 65 den kucukse "emekli olamazsin"

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas >= 65) {
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println("Emekli olamazsin");
            System.out.println(65-yas + "sene daha calismalisiniz");
        }

        scan.close();

    }
}
