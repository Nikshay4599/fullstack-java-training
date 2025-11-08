package week8;

public class week8_program3 {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); // will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index out of range.");
        } finally {
            System.out.println("This 'finally' block always executes.");
        }
    }
}

