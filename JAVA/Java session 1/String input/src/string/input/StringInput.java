package string.input;

import java.util.Scanner;

public class StringInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String a = sc.next();
            System.out.println("a=" + a);
            if (a.equals("exit")) {
                System.out.println("bye");
                break;
            }
        }

    }

}
