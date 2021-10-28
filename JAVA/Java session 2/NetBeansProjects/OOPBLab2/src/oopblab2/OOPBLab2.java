package oopblab2;

import java.util.Scanner;

public class OOPBLab2 {

    public static void main(String[] args) {
//        BSection bs = new BSection(4);
//        bs.doAssignment();

        Scanner sc=new Scanner(System.in);
        
        System.out.print("Human: ");
        String s=sc.nextLine();
        
//        s=s.toLowerCase();
//        if(s.equals("Hello")) {
//            System.out.println("Robot: Hi");
//        }
//        int[] ar = new int[3];
//        BSection bs=null;
        try { 
//            System.out.println("value=" + ar[5]);
//            int a=3/0;
//            bs.doAssignment();
        }catch(Exception e) {
            System.out.println("Other Error");
        }
//        
//        System.out.println("dojob");   
//     
        
        

    }

}

class BSection {

    public BSection() {
        System.out.println("Welcome to Section B");
        System.out.println("We are ready!");
//        doAssignment();
    }

    public BSection(int nstudent) {
        System.out.println("Welcome to Section B");
        System.out.println("Total Student: " + nstudent);
        System.out.println("We are ready!");
        doAssignment();
    }

    public void doAssignment() {
        System.out.println("Assignment Completed!");
    }
}
