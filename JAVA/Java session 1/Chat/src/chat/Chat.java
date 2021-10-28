package chat;

import java.util.Scanner;

public class Chat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while (true) {
//            String input = sc.nextLine();
//            input = input.toLowerCase();
//            if (input.equals("hello")) {
//                System.out.println("hi");
//            }
//            if (input.equals("exit")) {
//                break;
//            }
//        }

        while (true) {
            System.out.print("Teacher:");
            String input = sc.next();
            System.out.print("Students:");
            String inp = sc.next();
            if (inp.equals("exit")) {
                break;
            }

        }
    }

}
