/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4t2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Lab4T2 {

    public Lab4T2() {

        JFrame f = new JFrame("MySoftware");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 400);
        f.setVisible(true);

        JButton jb = new JButton("button1");
        f.add(BorderLayout.NORTH, jb);

        jb.addActionListener(new buttonbutton());

        JButton jb2 = new JButton("button2");
        f.add(BorderLayout.EAST, jb2);

        f.validate();
    }

    class buttonbutton implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String bn = e.getActionCommand();
            if (bn.equals("button1")) {
                //
            }
            System.out.println("okay boss"); 
            JOptionPane.showMessageDialog(null, "Welcome");

        }
    }

    public static void main(String[] args) {
        new Lab4T2();

    }

}
