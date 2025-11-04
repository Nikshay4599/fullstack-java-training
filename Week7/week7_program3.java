package Week7;

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class Multiple implements A, B {
    public void methodA() {
        System.out.println("Method A executed");
    }

    public void methodB() {
        System.out.println("Method B executed");
    }
}

public class week7_program3 {
    public static void main(String[] args) {
        Multiple obj = new Multiple();
        obj.methodA();
        obj.methodB();
    }
}

