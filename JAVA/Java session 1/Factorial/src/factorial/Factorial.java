package factorial;

import java.util.Scanner;

public class Factorial {

    public Factorial() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println("Factorial=" + ans);
    }

    public int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
//    public Factorial() {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int fact = 1;
//        for (int i = 1; i <= n; i++) {
//            fact *= i;
//        }
//        System.out.println("Fact=" + fact);
//    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
    }

}
