package Week4;

    

import java.util.Scanner;

public class week4_program2 {
    static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers (a b c): ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Max = " + maxOfThree(a, b, c));
        sc.close();
    }
}
