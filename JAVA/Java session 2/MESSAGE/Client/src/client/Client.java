package client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Client {

    Socket s;

    BufferedWriter writer;

    public Client() {

        JFrame frame = new JFrame("Client");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 450);

        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(400, 300));
        jp.setBackground(Color.PINK);
        frame.add(jp);

        JButton jb = new JButton("Connect");
        jp.add(BorderLayout.SOUTH, jb);
        jb.setBackground(Color.CYAN);

        JTextField jt = new JTextField();
        jt.setPreferredSize(new Dimension(250, 100));
        jp.add(jt);

        JButton jb2 = new JButton("Send");
        jp.add(BorderLayout.EAST, jb2);
        jb2.setBackground(Color.CYAN);
        frame.validate();

        jb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.out.println("Connecting with server");
                    s = new Socket("127.0.0.1", 1103);
                    writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                    System.out.println("Connected");

                } catch (Exception ex) {
                    System.out.println("Error=" + ex.getMessage());
                }
            }
        });

        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                String s = "  " + jt.getText();
                jt.setText("");
                try {
                    writer.write(s);
                    writer.write("\r\n");
                    writer.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        );

    }

    public static void main(String[] args) {
        new Client();
    }

}
