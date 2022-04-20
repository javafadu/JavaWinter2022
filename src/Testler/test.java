public class test {

    public static void main(String[] args) {

            try {

                calis();

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }

        }


    private static void calis() {

        throw new RuntimeException("Çoook çalış");

    }
}