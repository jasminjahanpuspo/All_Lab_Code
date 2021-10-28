package random;

import java.util.Scanner;

public class Random {

    public Random() {
        Random r = new Random();
       
        try {
            for (int i = 0; i < 3; i++) {
                int n = r.nextInt(30);
                Scanner sc = new Scanner(System.in);
                int nn = sc.nextInt();
                if (nn == n) {
                    System.out.println("Win");
                } else {
                    System.out.println("Loser");
                }
            }
        } catch (Exception ex) {

        }

    }

    public static void main(String[] args) {
        new Random();
    }

}
