package pkgthrows;

public class Throws {

    public Throws() {
        try {
            double d = div(2, 0);
            System.out.println(d);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    double div(int a, int b) throws Exception {
        double d = 0;
        if (b == 0) {
            throw new Exception("wrong choose b");
        }
        d = a / b;
        return d;
    }

    public static void main(String[] args) {
        Throws t = new Throws();
    }

}
