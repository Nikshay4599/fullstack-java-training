package Week4;

import java.util.Scanner;

public class week4_program1 {
    // Returns n!; handles 0! = 1; uses long up to 20! safely on most JDKs
    static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        long ans = 1;
        for (int i = 2; i <= n; i++) ans *= i;
        return ans;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " = " + factorial(n));
        sc.close();
    }
}

