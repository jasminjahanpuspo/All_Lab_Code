package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        MyCalculator m = new MyCalculator();
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            char c = sc.next().charAt(0);
            try {
                if (c == '+') {
                    m.sum(a, b);
                }
                if (c == '-') {
                    m.sub(a, b);
                }
                if (c == '*') {
                    m.pro(a, b);
                }
                if (c == '/') {
                    m.div(a, b);
                }
                if (c == '^') {
                    m.pow(a, b);
                }
            } catch (Exception ex) {
                System.out.println("error");
            }
            

        }

    }

}

class MyCalculator {

    public void sum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum="+sum);
    }

    public void sub(int a, int b) {
        int sub = a - b;
        System.out.println("Sub=" + sub);
    }

    public void pro(int a, int b) {
        int mult = a * -b;
        System.out.println("Mult=" + mult);
    }

    public void div(int a, int b) {
        if (b == 0) {
            System.out.println("cheak b");
        }
        float div = (float) a / b;
        System.out.println("Div=" + div);
    }

    public void pow(int a, int b) {
        int re = 1;
        while (b > 0) {
            re *= a;
            --b;
        }
        System.out.println("Power=" + re);

    }
}
