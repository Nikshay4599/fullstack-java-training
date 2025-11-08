package week8;

public class week8_program1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

