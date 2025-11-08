

public class week2_program2 {
    public static void main(String[] args) {
        // Implicit Conversion
        int a = 10;
        double b = a;

        // Explicit Conversion
        double x = 9.78;
        int y = (int) x;

        System.out.println("Implicit (int to double): " + b);
        System.out.println("Explicit (double to int): " + y);
    }
}
