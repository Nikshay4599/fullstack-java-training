package week6;

public class week6_program2 {
    // add two ints
    public int add(int a, int b) {
        return a + b;
    }

    // add three ints (overloaded)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // add doubles (overloaded)
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        week6_program2 x = new week6_program2();
        System.out.println("add(2,3) = " + x.add(2,3));
        System.out.println("add(1,2,3) = " + x.add(1,2,3));
        System.out.println("add(2.5,3.1) = " + x.add(2.5,3.1));
    }
}
