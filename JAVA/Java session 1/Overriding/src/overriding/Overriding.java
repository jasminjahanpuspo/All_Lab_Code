package overriding;

public class Overriding {

    public static void main(String[] args) {
        Cse cs = new Cse();
        cs.name = "puspo";
        cs.reg = 34;
        cs.info();
        students s = new students();

    }

}

class students {

    String name;
    int reg;

    void info() {
        System.out.println(name);
        System.out.println(reg);
    }
}

class Cse extends students {
    void info(){
        System.out.println("Hi");
    }
}
