package client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client {

    Socket s;

    public Client() {
//        JFrame f = new JFrame("MyChat");
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setSize(600, 400);
//        f.setVisible(true);
//
//        f.setLayout(new FlowLayout());
//        JPanel jp = new JPanel();
//        jp.setPreferredSize(new Dimension(500, 350));
//        jp.setBackground(Color.blue);
//        f.add(jp);
//
//        JTextArea jt = new JTextArea();
//        jt.setPreferredSize(new Dimension(400, 150));
//        jp.add(jt);
//
//        JTextField jtt = new JTextField();
//        jtt.setPreferredSize(new Dimension(350, 50));
//        jp.add(jtt);
//
//        JButton jb = new JButton("Send");
//
//        jp.add(BorderLayout.WEST, jb);
//        buttonbutton b = new buttonbutton();
//        jb.addActionListener(b);
//
//        f.validate();
        try {
            System.out.println("Connecting with server");
            s = new Socket("127.0.0.1", 1103);
            System.out.println("Connected");

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String data = br.readLine();
            System.out.println("From server=" + data);

            PrintWriter pw = new PrintWriter(s.getOutputStream());
            pw.println();
            pw.flush();

        } catch (Exception ex) {
            System.out.println("error");
        }
    }

//    class buttonbutton implements ActionListener {
//
//        public void actionPerformed(ActionEvent e) {
//            String jp = e.getActionCommand();
//            if (jp.equals("Send")) {
//                // System.out.println("enter..");
//                try {
//                    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//                    PrintWriter pw = new PrintWriter(s.getOutputStream());
//
//                    String data = br.readLine();
//                    System.out.println("data=" + data);
//                    pw.println("thanks");
//                    pw.flush();
//                } catch (Exception ex) {
//                    System.out.println("sorry");
//                }
//            }
//            JOptionPane.showMessageDialog(null, "msg Send");
//        }
//    }
    public static void main(String[] args) {
        Client s = new Client();

    }

}
