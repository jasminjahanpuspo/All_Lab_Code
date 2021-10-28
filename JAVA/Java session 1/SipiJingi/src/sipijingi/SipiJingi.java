package sipijingi;

public class SipiJingi {

    class Jingi {

        final int a = 34;

        public void sing() {
            Test t = new Test(this);
            this.jump();
            System.out.println("Jingi sing");
        }

        public void jump() {
            System.out.println("Jingi jumping");
        }

    }

    class Sipi extends Jingi {

        public void sing() {
            System.out.println("Sipi sing");
            System.out.println("Reg=" + super.a);
        }

        public void jump() {
            System.out.println("Sipi jumping");
        }

        public void walk() {
            System.out.println("Sipi walking");
        }
    }

    class Test {

        public Test(Jingi j) {

        }
    }

    public static void main(String[] args) {
        Jingi j = new Jingi();
        Test t = new Test();

    }

}
