package oopbbn;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OOPBBn {

    Font f = new Font("Solaimanlipi", Font.PLAIN, 16);
    HashMap<String, String> hm = new HashMap();
    JFrame frame;

    public OOPBBn() {
        String fpath = "F:\\data.txt";
        Scanner sc = new Scanner(System.in);
        String st = new String();
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(fpath), "UTF-8"));
            String line;
            String[] bn;

            while ((line = br.readLine()) != null) {
                bn = line.split("=");
                hm.put(bn[0], bn[1]);

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        frame = new JFrame("Dictionery");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 480);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        JPanel jp = new JPanel();
        jp.setBackground(Color.BLUE);
        jp.setPreferredSize(new Dimension(550, 450));

        JTextField jt = new JTextField();
        jt.setBackground(Color.CYAN);
        jt.setPreferredSize(new Dimension(100, 100));

        JTextArea ja = new JTextArea();
        ja.setBackground(Color.white);
        ja.setPreferredSize(new Dimension(100, 100));
        ja.setFont(f);

        JButton jb = new JButton("Search");
        jb.setBackground(Color.PINK);
        jb.setPreferredSize(new Dimension(70, 100));

        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ja.setText(hm.get(jt.getText()));
            }
        });

        jp.add(jt);
        jp.add(jb);
        jp.add(ja);

        frame.add(jp);
        frame.validate();

    }

    public static void main(String[] args) {
        OOPBBn oopbBn = new OOPBBn();
    }
}
