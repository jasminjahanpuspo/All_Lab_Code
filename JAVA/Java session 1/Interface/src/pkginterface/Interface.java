package pkginterface;

public class Interface {

    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.open();

        Mobile m = new Mobile(mp);
        Iphone i = new Iphone(mp);
    }

}

class Iphone {

    port pi;

    public Iphone(port pi) {
        pi.play();
        pi.pause();
    }
}

class Mobile {

    button bi;

    public Mobile(button bi) {
        bi.on();
        bi.off();
    }
}

class MusicPlayer implements button, port {

    public void open() {
        System.out.println("This is my music player");
    }

    @Override
    public void on() {
        System.out.println("song on");
    }

    @Override
    public void off() {
        System.out.println("song off");
    }

    @Override
    public boolean play() {
        System.out.println("playing");
        return false;
    }

    @Override
    public boolean pause() {
        System.out.println("stop");
        return false;
    }
}

interface button {

    abstract public void on();

    abstract public void off();
}

interface port {

    abstract public boolean play();

    abstract public boolean pause();
}
