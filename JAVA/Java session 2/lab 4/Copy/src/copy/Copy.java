package copy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Copy {

    public Copy() {
        JFrame frame = new JFrame("Copy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);

        frame.setLayout(new FlowLayout());

        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(400, 300));
        jp.setBackground(Color.RED);
        frame.add(jp);

        JTextArea jt = new JTextArea();
        jt.setPreferredSize(new Dimension(50, 200));
        jp.add(jt);

        JButton jb1 = new JButton("Copy");
        jb1.setBackground(Color.WHITE);
        jb1.setForeground(Color.BLACK);
        jp.add(BorderLayout.SOUTH, jb1);
        //jb1.addActionListener(new buttonbutton());

        JTextArea jt2 = new JTextArea();
        jt2.setPreferredSize(new Dimension(50, 200));
        jp.add(jt2);

//        jb1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                jt2.setText(jt.getText());
//            }
//        });
        class buttonbutton implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                String bn = e.getActionCommand();
                if (bn.equals("Copy")) {
                    jt2.setText(jt.getText());
                }

                // JOptionPane.showMessageDialog(null, "Welcome");
            }
        }
        

    }
//        class buttonbutton implements ActionListener {
//
//            public void actionPerformed(ActionEvent e) {
//                String bn = e.getActionCommand();
//                if (bn.equals("Copy")) {
//                    jt2.setText(jt.getText());
//                }
//
//                // JOptionPane.showMessageDialog(null, "Welcome");
//            }
//        }

    public static void main(String[] args) {
        new Copy();
    }

}
