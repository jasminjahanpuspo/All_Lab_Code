package server;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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
        jp.setBackground(Color.RED);
        frame.add(jp);

        JLabel jl = new JLabel("Messeges");
        jl.setPreferredSize(new Dimension(160, 60));
        jp.add(jl);

        JTextArea jt = new JTextArea();
        jt.setPreferredSize(new Dimension(350, 150));
        jp.add(jt);

        try {
            server = new ServerSocket(1103);  //wait for client
            System.out.println("Server Created");

            Socket s = server.accept();
            System.out.println("Client Connected=" + s.getInetAddress());
            //for (int i = 0; i < 12; i++) {
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String data = br.readLine();
                jt.setText(data);
            //}

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Server();
    }

}
