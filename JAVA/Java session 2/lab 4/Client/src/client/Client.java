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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client {

    Socket s;

    public Client() {
        JFrame frame = new JFrame("Client");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);

        frame.setLayout(new FlowLayout());

        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(400, 300));
        jp.setBackground(Color.RED);
        frame.add(jp);

        JButton jb = new JButton("Connect");
        jp.add(BorderLayout.SOUTH, jb);

        jb.addActionListener(new buttonbutton());

        JTextArea jt4 = new JTextArea();
        jt4.setPreferredSize(new Dimension(250, 100));
        jp.add(jt4);

        JButton jb2 = new JButton("Send");
        jp.add(BorderLayout.EAST, jb2);
        jb2.addActionListener(new buttonbutton());

    }

    class buttonbutton implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String bn = e.getActionCommand();
            if (bn.equals("Connect")) {
                try {
                    System.out.println("Connecting with server");
                    s = new Socket("127.0.0.1", 1103);
                    System.out.println("Connected");

                } catch (Exception ex) {
                    System.out.println("Error.");
                }

            }
            if (bn.equals("Send")) {

                try {

                    PrintWriter pw = new PrintWriter(s.getOutputStream());

                    pw.println();
                    pw.flush();

                } catch (Exception ex) {
                    System.out.println("Sorry.");
                }
                JOptionPane.showMessageDialog(null, "Sending...");
            }

        }
    }

    public static void main(String[] args) {
        new Client();
    }

}
