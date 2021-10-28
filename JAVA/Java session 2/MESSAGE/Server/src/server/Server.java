package server;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Server {

    ServerSocket server;

    public Server() {
        JFrame frame = new JFrame("Server");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);

        frame.setLayout(new FlowLayout());

        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(400, 300));
        jp.setBackground(Color.PINK);
        frame.add(jp);

        JLabel jl = new JLabel("Messeges");
        jl.setPreferredSize(new Dimension(160, 60));
        jp.add(jl);

        JTextField jt = new JTextField();
        jt.setPreferredSize(new Dimension(350, 150));
        jp.add(jt);
        frame.validate();
        try {
            server = new ServerSocket(1103);
            System.out.println("Server Created");

            Socket s = server.accept();
            System.out.println("Client Connected=" + s.getInetAddress());

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            System.out.println("Waiting for me");
            while (true) {
                String data1 = br.readLine().trim();
                System.out.println("Received : " + data1);
                jt.setText(data1);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Server();
    }

}
