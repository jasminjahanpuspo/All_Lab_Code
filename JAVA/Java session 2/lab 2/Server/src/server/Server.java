package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    ServerSocket server;

    public Server() {
        try {
            server = new ServerSocket(1103);
            System.out.println("Server created");
            Socket s = server.accept();
            System.out.println("Client connectede" + s.getInetAddress());

            PrintWriter pw = new PrintWriter(s.getOutputStream());
            pw.println();
            pw.flush();

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String data = br.readLine();
            System.out.println("From client=" + data);

        } catch (Exception ex) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Server ss = new Server();
    }

}
