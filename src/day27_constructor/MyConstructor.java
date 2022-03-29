package day27_constructor;

public class MyConstructor {

        int x=5;
    MyConstructor(){
            System.out.println("-x"+ x);
        }
    MyConstructor (int x){
            this();
            this.x = x;
            System.out.println("-x"+x);
        }
}
