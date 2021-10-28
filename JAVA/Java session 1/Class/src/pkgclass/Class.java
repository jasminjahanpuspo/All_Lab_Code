package pkgclass;

public class Class {

    class MyClass {

        public MyClass() {
            System.out.println("This is class 1");
            MyClass2 mc = new MyClass2();

        }
    }

    class MyClass2 {

        public MyClass2() {
            System.out.println("This is class 2");
        }
    }

    public static void main(String[] args) {
        Class c = new Class();
    }

}
