package pkgabstract;

public class Abstract {

    public static void main(String[] args) {
        Cse cs = new Cse();
        cs.name = "puspo";
        cs.reg = 34;
        cs.doprogramming();
        cs.info();

        Eng en = new Eng();
        en.name = "pop";
        en.reg = 34;
        en.doliterature();
        en.info();
    }

}

abstract class general {

    String name;
    int reg;

    public void info() {
        System.out.println("I m student");
    }

    abstract public void dograduation();
}

class Cse extends general {

    public void doprogramming() {
        System.out.println(name);
        System.out.println(reg);
        System.out.println("Cse graduated");
    }

    public void dograduation() {
        System.out.println("graduated");
    }
}

class Eng extends general {

    public void doliterature() {
        System.out.println(name);
        System.out.println(reg);
        System.out.println("Eng graduated");
    }

    public void dograduation() {
        System.out.println("Graduated");
    }
}
