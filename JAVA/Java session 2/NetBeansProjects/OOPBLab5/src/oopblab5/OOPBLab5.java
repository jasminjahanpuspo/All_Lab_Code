package oopblab5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ACL
 */
public class OOPBLab5 {

    JFrame frame;

    public OOPBLab5() {
        frame = new JFrame("OOP B Section Software");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);

        frame.setLayout(new FlowLayout());

        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(400, 400));
        jp.setBackground(Color.lightGray);
        frame.add(jp);
        
//        jp.setLayout(new BoxLayout(jp, BoxLayout.X_AXIS));
        JPanel jp2 = new JPanel();
        jp2.setPreferredSize(new Dimension(150, 400));
        jp2.setBackground(Color.yellow);
        frame.add(jp2);

        JLabel jl = new JLabel("Name: ");
        jl.setPreferredSize(new Dimension(60, 60));
        JTextField jt = new JTextField();
        jt.setPreferredSize(new Dimension(100, 60));
        
        Font f=new Font("Solaimanlipi", Font.PLAIN, 16);
        jt.setFont(f);

        jp.add(jl);
        jp.add(jt);

        frame.validate();
    }

    public static void main(String[] args) {
        new OOPBLab5();
    }

}
