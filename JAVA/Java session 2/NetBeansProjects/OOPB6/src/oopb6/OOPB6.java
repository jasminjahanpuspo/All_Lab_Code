/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopb6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ACL
 */
public class OOPB6 {

    public OOPB6() {
//        try {
//            double r = div(2, 0);
//            System.out.println("r=" + r);
//        } catch (Exception ex) {
//            System.out.println("error=" + ex.getMessage());
//        }
        JFrame j = new JFrame("MySoftware");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(600, 400);
        j.setVisible(true);

        JButton jb = new JButton("DontClick");
        MyButtonListener bn = new MyButtonListener();
        jb.addActionListener(bn);
        j.add(jb);
        j.validate();
    } 
    class MyButtonListener implements ActionListener { 
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Your pc hacked!",
                    "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }

    double div(int a, int b) throws Exception {
        double d = 0;
        if (b == 0) {
            throw new Exception("Invalid b");
        }
        d = a / b;
        return d;
    }

    public static void main(String[] args) {
        OOPB6 obj = new OOPB6();
//        Jingi j = new Jingi();
//        Test t = new Test(j);

    }

}

class MyClass {

    public MyClass() {
        MyClass2 m = new MyClass2();
        System.out.println("Initializing...");
    }

    public void doJob() {
        System.out.println("my job");
    }

    class MyClass2 {

        public MyClass2() {

        }

        public void hello() {
        }
    }

}

class Jingi {

    final int AGE = 2;

    public void sing() {
        Test t = new Test(this);
//        jump();
        this.jump();

        System.out.println("singing jingi song");
    }

    public void jump() {
        System.out.println("jingi jump");
    }
}

class Test {

    public Test(Jingi j) {

    }
}

class Sipi extends Jingi {

    public void sing() {
        System.out.println("age=" + super.AGE);
        System.out.println("singing sipi song");
    }

    public void jump() {
        System.out.println("sipi jump");
    }

    public void walk() {
        System.out.println("sipi can walk");
    }
}
