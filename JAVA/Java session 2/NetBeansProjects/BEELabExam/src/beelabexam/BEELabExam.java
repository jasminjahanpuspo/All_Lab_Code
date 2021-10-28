/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beelabexam;

/**
 *
 * @author ACL
 */
public class BEELabExam {

    GUI gui;

    public BEELabExam() {
        gui = new GUI();
        gui.setVisible(true);
    }

    public static void main(String[] args) {
        new BEELabExam();
    }

}
