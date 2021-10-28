/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopb4;

import java.util.Random;

/**
 *
 * @author ACL
 */
public class OOPB4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
//        Random r = new Random();
//        for (int i = 0; i < 5; i++) {
//            int n = r.nextInt(10);
//            System.out.println("n=" + n);
//        }
        
//        Laptop lap=new Laptop();
//        lap.switchON();
        
        MusicPlayer mp=new MusicPlayer();
//        mp.openAudioOut();
//        mp.play();
//        mp.mute();
//        
        Dipraj d=new Dipraj(mp); 
    }

}

class Dipraj {
    buttonInterface bbi;
    public Dipraj(buttonInterface bi) {
        bbi=bi;
        bi.play();
        bi.next();
        bi.previous(); 
    }
    
}
 
class MusicPlayer implements buttonInterface, portInterface{

    final int np=56;
    public MusicPlayer() {
        System.out.println("np="+np);
//        np=43;
        System.out.println("This is MusicPlayer Constructor");
        System.out.println("Total USB="+nusb);
//        nusb=3;
    }
    private void checkFile() {
        System.out.println("file check");
    }
    public void mute() {
        System.out.println("muted");
    }
    @Override
    public boolean play() {
        System.out.println("playing");
        return false;
    }
    @Override
    public void next() {
        System.out.println("next music");
    }
    @Override
    public void previous() {
        System.out.println("previous music");
    } 
    
    public void openUSB() {
        System.out.println("USB Opened");
    }
    public void openAudioOut() {
        System.out.println("Audio jack open");
    }
}


interface portInterface {
    public int nusb=2;
    public abstract void openUSB();
    public abstract void openAudioOut();
}

interface buttonInterface {
    public abstract boolean play();
    public abstract void next();
    public abstract void previous(); 
}






/////

abstract class Computer {
    abstract public void switchON();
    abstract public void switchOFF();
    abstract protected void startFans();
}

class Laptop extends Computer {

    @Override
    public void switchON() {
        System.out.println("switch is on");
    }

    @Override
    public void switchOFF() {
        System.out.println("Switch is Off");
    }

    @Override
    protected void startFans() {
        System.out.println("All fan started");
    }

}