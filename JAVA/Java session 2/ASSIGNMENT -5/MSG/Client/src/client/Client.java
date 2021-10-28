package client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client {

    JTextArea ta;
    Socket s;

    public Client() {
        JFrame f = new JFrame("CLIENT");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 400);
        f.setVisible(true);

        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(400, 200));
        jp.setBackground(Color.pink);
        f.add(jp);
        JButton jb2 = new JButton("Connect");
        jb2.setBackground(Color.blue);
        jp.add(BorderLayout.SOUTH, jb2);

        ta = new JTextArea();
        ta.setPreferredSize(new Dimension(450, 250));
        jp.add(ta);

        JButton jb = new JButton("send");
        jb.setBackground(Color.blue);
        jp.add(jb);

        button b = new button();
        jb.addActionListener(b);
        jb2.addActionListener(b);

        

    }

    class button implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String bn = e.getActionCommand();
            if (bn.equals("Connect")) {
                try {

                    s = new Socket("127.0.0.1", 1103);
                    System.out.println("connected");

                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            if (bn.equals("send")) {

                try {
                    String ss = " " + ta.getText();
                    ta.setText(" ");

                    PrintWriter pw = new PrintWriter(s.getOutputStream());
                    pw.println(ss);
                    pw.flush();
                } catch (Exception ex) {

                }
            }

        }
    }

    public static void main(String[] args) {
        new Client();
    }

}
