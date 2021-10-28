package panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel {

    JFrame f;

    public Panel() {
        f =new JFrame("Panel");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setVisible(true);
         f.setLayout(new FlowLayout());

        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(220, 200));
        jp.setBackground(Color.red);
        f.add(jp);

        JPanel jp1 = new JPanel();
        jp1.setPreferredSize(new Dimension(220, 200));
        jp1.setBackground(Color.green);
        f.add(jp1);

        JPanel jp2 = new JPanel();
        jp2.setPreferredSize(new Dimension(220, 200));
        jp2.setBackground(Color.blue);
        f.add(jp2);

        JPanel jp3 = new JPanel();
        jp3.setPreferredSize(new Dimension(220, 200));
        jp3.setBackground(Color.yellow);
        f.add(jp3);

        f.validate();
    }

    public static void main(String[] args) {
        Panel p = new Panel();
    }

}
