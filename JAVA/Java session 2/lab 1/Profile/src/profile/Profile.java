package profile;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Profile {

    JFrame f;

    public Profile() {
        f = new JFrame("My Card");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(430, 320);
        f.setVisible(true);
        f.setLocation(300, 200);

        f.setLayout(new FlowLayout());

        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(210, 230));
        jp.setBackground(Color.red);
        f.add(jp);

        JLabel jl = new JLabel();
        jl.setIcon(new ImageIcon("D:\\zerin\\914296068718918_7719592523786192811_n.jpg"));
        jl.setPreferredSize(new Dimension(200, 220));
        jp.add(jl);

        JPanel jp2 = new JPanel();
        jp2.setPreferredSize(new Dimension(180, 230));
        f.add(jp2);

        JLabel jl2 = new JLabel("Name: Jasmin Jahan");
        jp2.add(jl2);
        JLabel jl3 = new JLabel("Depertment: CSE");
        jp2.add(jl3);
        JLabel jl4 = new JLabel("Reg : 170103020034");
        jp2.add(jl4);

        JPanel jp3 = new JPanel();
        jp3.setPreferredSize(new Dimension(100, 50));
        f.add(jp3);

        JLabel jl5 = new JLabel("Java is Beautiful");
        jp3.add(jl5);

        f.validate();

    }

    public static void main(String[] args) {

        Profile p = new Profile();
    }

}
