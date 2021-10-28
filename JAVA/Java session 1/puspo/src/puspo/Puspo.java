package puspo;

public class Puspo {

    public static void main(String[] args) {
        System.out.println("Puspo");
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello World.");
        }
        int n = 4;
        if (n % 2 == 0) {
            System.out.println("Even");
        } else if (n % 2 == 1) {
            System.out.println("Odd");
        }
        int fact = 1, sum = 0, m = 5;
        for (int i = 1; i <= m; i++) {
            fact *= i;
            sum += i;

        }
        System.out.println("Factorial=" + fact);
        System.out.println("Sum=" + sum);

        MyCalculator mc = new MyCalculator();
        mc.sum();
        mc.mult();

        Car c = new Car();
        c.start();
        c.stop();

        Cse cs = new Cse();
        cs.name = "puspo";
        cs.reg = 34;
        cs.dog();

        Eng en = new Eng();
        en.name = "pp";
        en.reg = 34;
        en.dop();

    }

}

class students {

    String name;
    int reg;

    public void info() {
        System.out.println(name);
        System.out.println(reg);

    }
}

class Cse extends students {

    public void dog() {
        System.out.println("gggg");

    }

}

class Eng extends students {

    public void dop() {
        System.out.println("pppp");

    }

}

class Car {

    public void start() {
        System.out.println("starting");
        int n = 12;
        System.out.println("speed " + n + " seconds");
        move(3);
    }

    public void stop() {
        System.out.println("stopped");
        move();
    }

    private void move(int a) {
        System.out.println("moving");
    }

    protected void move() {
        System.out.println("moving");
    }

}

class MyCalculator {

    int a = 10, b = 20, sum = 0, mult = 1;

    public void sum() {
        sum = a + b;
        System.out.println("sum" + sum);
    }

    public void mult() {
        mult = a * b;
        System.out.println("mult" + mult);
    }
}
