package day33_varargs_StringBuilder;

public class C06_StringBuilder_insert_reverse {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Prize dikkat");
        System.out.println(sb1.insert(12," edin.")); // Prize dikkat edin.
        String str="Hayatta cok guzel seyler var";
        System.out.println(sb1.insert(0,str,0,8)); // Hayatta Prize dikkat edin.
        System.out.println(sb1.reverse()); // .nide takkid ezirP attayaH
        System.out.println(sb1); // .nide takkid ezirP attayaH (mutable)
        System.out.println(sb1.reverse()); // Hayatta Prize dikkat edin.

        System.out.println(sb1.substring(3,5)); // at
        System.out.println(sb1); // Hayatta Prize dikkat edin. (substring methodu String methodudur)
        System.out.println(sb1.subSequence(3,5)); // at
        System.out.println(sb1); // Hayatta Prize dikkat edin. (subSequence da baska methoddan)


    }
}
