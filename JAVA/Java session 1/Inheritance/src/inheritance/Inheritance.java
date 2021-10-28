package inheritance;

public class Inheritance {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.mute();
        m.off();
        m.on();
    }

}

class Cover {

    public void mute() {
        System.out.println("muted");
    }
}

class Mobile extends Cover {

    public void on() {
        System.out.println("On");
    }

    public void off() {
        System.out.println("Off");
    }
}
