package oopbthread1;

public class OOPBThread1 {

    public OOPBThread1() {
        MyClass m = new MyClass();
        m.start();

        try {
            m.join();
        } catch (Exception ex) {
        }

        MyClass2 m2 = new MyClass2();
        m2.start();

//        MyClass3 m3=new MyClass3();
//        Thread t=new Thread(m3);
//        t.start();
//
//        for (int i = 0; i > -1; i++) {
//            System.out.println("Main Class");
//            try {
//                Thread.sleep(10);
//            } catch (Exception ex) {
//            };
//        }
        System.out.println("Completed");
    }

    public static void main(String[] args) {
        new OOPBThread1();
    }
}

class MyClass3 implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("This Is MyClass3");
            try {
                Thread.sleep(10);
            } catch (Exception ex) {
            };
        }
    }
}

class MyClass extends Thread {

    @Override
    public void run() {

        while (true) {
            System.out.println("This Is MyClass");
            try {
                Thread.sleep(10);
            } catch (Exception ex) {
            };

        }
    }
}

class MyClass2 extends Thread {

    @Override
    public void run() {

        while (true) {
            System.out.println("This Is MyClass2");
            try {
                Thread.sleep(10);
            } catch (Exception ex) {
            };
        }
    }
}
