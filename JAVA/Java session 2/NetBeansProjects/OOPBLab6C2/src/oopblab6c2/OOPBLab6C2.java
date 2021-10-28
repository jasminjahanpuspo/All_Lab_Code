package oopblab6c2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class OOPBLab6C2 {

    Socket s;

    public OOPBLab6C2() {
        try {
            System.out.println("Connecting with server");
            s = new Socket("127.0.0.1", 1103);
            System.out.println("Connected.");
            
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw=new PrintWriter(s.getOutputStream());
           
            String data=br.readLine();
            System.out.println("data="+data);
            pw.println("Thanks");
            pw.flush();
            
            
            
        } catch (Exception ex) {
            System.out.println("Error=" + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new OOPBLab6C2();
    }

}
