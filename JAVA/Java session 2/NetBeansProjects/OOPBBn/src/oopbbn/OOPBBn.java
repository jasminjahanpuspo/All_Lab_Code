/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopbbn;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class OOPBBn {

    /*
        Font f=new Font("Solaimanlipi", Font.PLAIN, 16);
        jt.setFont(f);
    */
    
    public OOPBBn() {   
        String fpath = "D:\\data.txt";
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(fpath), "UTF-8") );
            String line=br.readLine();
            line=br.readLine();
            System.out.println("line="+line);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new OOPBBn();
    }

}
