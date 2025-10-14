package Week2;

public class week2_program2 {
    public static void main(String[] args) {
        // Implicit (widening)
        int i = 100;
        double d = i;
        System.out.println("Implicit conversion int to double: " + d);

        // Explicit (narrowing)
        double x = 9.78;
        int y = (int) x;
        System.out.println("Explicit conversion double to int: " + y);
    }
}
