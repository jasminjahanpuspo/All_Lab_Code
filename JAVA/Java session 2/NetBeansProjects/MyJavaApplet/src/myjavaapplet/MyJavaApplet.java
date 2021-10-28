/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myjavaapplet;
 
import java.applet.Applet;
import java.awt.Graphics;

public class MyJavaApplet extends Applet{
 
    public void init() {
        this.setSize(600, 400);
    }
    public void paint(Graphics g) {
        g.drawString("Hello Web", 50, 50);
        g.drawOval(100, 100, 30, 30);
    }
}