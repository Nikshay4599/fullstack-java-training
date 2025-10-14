package Week3;



public class week3_program3 {
    public static void main(String[] args) {
        int count = 10;
        int a = 0, b = 1;
        System.out.print("Fibonacci (first 10): ");
        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}


