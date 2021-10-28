package pkgtry.pkgcatch.pkgfinally;

public class TryCatchFinally {

    public static void main(String[] args) {
        int a = 10, b = 20, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("error");
        }

    }

}
