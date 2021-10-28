package server;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Server {

    Socket s;

    public Server() {
        JFrame f = new JFrame("ko");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 400);
        f.setVisible(true);

        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(400, 200));
        jp.setBackground(Color.pink);
        f.add(jp);

        JTextArea ta = new JTextArea();
        ta.setPreferredSize(new Dimension(450, 250));
        jp.add(ta);

        try {
            ServerSocket server = new ServerSocket(1103);
            System.out.println("server Craeted");
            s = server.accept();
            System.out.println("connected");
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String data = br.readLine();
            System.out.println(data);
            ta.setText(data);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }



    public static void main(String[] args) {
        new Server();
    }

}
