package oopblab6c1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class OOPBLab6C1 {

    ServerSocket server;

    public OOPBLab6C1() {
        try {
            server = new ServerSocket(1103);
            System.out.println("Server Created");

            Socket s = server.accept();       //wait for client
            System.out.println("Client Connected=" + s.getInetAddress());

            PrintWriter pw = new PrintWriter(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            pw.println("hello");
            pw.flush();

            String data = br.readLine();
            System.out.println("From Client=" + data);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new OOPBLab6C1();
    }

}
