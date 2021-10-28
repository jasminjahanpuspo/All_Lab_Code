/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopbthreadsync;

public class OOPBThreadSync {

    public OOPBThreadSync() {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.start();
        p2.start();
    }

    public static void main(String[] args) {
        new OOPBThreadSync();
    }

}

class Person extends Thread {

    public void run() {
        ATM a = new ATM();
        a.withdrawMoney(1000);
    }
}   

class ATM {

    public synchronized void withdrawMoney(int amount) {
        System.out.println("money withdraw=" + amount);
    }

}
