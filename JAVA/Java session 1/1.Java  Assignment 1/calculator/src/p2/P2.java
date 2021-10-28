package p2;

import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mycalculator m = new Mycalculator();

        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            char c = sc.next().charAt(0);

            try {
                if (c == '+') {
                    m.sum(a, b);
                } else if (c == '-') {
                    m.sub(a, b);
                } else if (c == '*') {
                    m.mult(a, b);
                } else if (c == '/') {
                    m.div(a, b);
                } else if (c == '^') {
                    m.power(a, b);
                } else {
                    System.out.println("Error");
                }
            } catch (Exception e) {
                System.out.println("Number formatting exception " + e.getMessage());

            }

        }
    }
}

class Mycalculator {

    public void sum(int a, int b) {
        int sum = a + b;
        System.out.println("sum=" + sum);
    }

    public void sub(int a, int b) {
        int sub = a - b;
        System.out.println("sub=" + sub);
    }

    public void mult(int a, int b) {
        int mult = a * b;
        System.out.println("mult=" + mult);
    }

    public void div(int a, int b) {
        try {
            float div = (float) a / b;
            System.out.println("div=" + div);
        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());

        }
    }

    public void power(int a, int b) {
        int result = 1;
        while (b > 0) {
            result *= a;
            --b;
        }
        System.out.println("power=" + result);
    }

}
