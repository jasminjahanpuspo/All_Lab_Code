package loginn;

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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInn {

    public LogInn() {
        JFrame f = new JFrame("LogIn");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 200);
        f.setVisible(true);

       // f.setLayout(new FlowLayout());
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

        JPasswordField js = new JPasswordField();
        js.setPreferredSize(new Dimension(310, 50));
        jp.add(js);

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
         new LogInn();
    }

}
