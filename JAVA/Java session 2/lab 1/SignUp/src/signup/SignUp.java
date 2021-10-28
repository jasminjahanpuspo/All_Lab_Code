package signup;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SignUp {

    public SignUp() {
        JFrame f = new JFrame("SignUp");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 700);
        f.setVisible(true);

        f.setLayout(new FlowLayout());
        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(400, 400));
        jp.setBackground(Color.CYAN);
        f.add(jp);

        JLabel j1 = new JLabel("Name: ");
        j1.setPreferredSize(new Dimension(50, 30));
        jp.add(j1);

        JTextField jt = new JTextField();
        jt.setPreferredSize(new Dimension(310, 50));
        jp.add(jt);

        JLabel j3 = new JLabel("reg: ");
        j3.setPreferredSize(new Dimension(50, 30));
        jp.add(j3);

        JTextField jtt = new JTextField();
        jtt.setPreferredSize(new Dimension(310, 50));
        jp.add(jtt);

        JLabel j2 = new JLabel("Dept: ");
        j2.setPreferredSize(new Dimension(50, 30));
        jp.add(j2);

        JTextField jt3 = new JTextField();
        jt3.setPreferredSize(new Dimension(310, 50));
        jp.add(jt3);

        JLabel j4 = new JLabel("Password: ");
        j4.setPreferredSize(new Dimension(50, 30));
        jp.add(j4);

        JTextField jt4 = new JTextField();
        jt4.setPreferredSize(new Dimension(310, 50));
        jp.add(jt4);

        JButton jb = new JButton("Login");

        jb.setBackground(Color.pink);

        jp.add(BorderLayout.WEST, jb);
        buttonbutton b = new buttonbutton();
        jb.addActionListener(b);

        f.validate();

    }

    class buttonbutton implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String jp = e.getActionCommand();
            if (jp.equals("Login")) {
                System.out.println("enter..");
            }
            JOptionPane.showMessageDialog(null, "welcome");
        }
    }

    public static void main(String[] args) {
        SignUp sp = new SignUp();
    }

}
