package week10;
    
import java.util.function.BiFunction;
import java.util.Scanner;

public class Week10_Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        int result = add.apply(a, b);

        System.out.println("Sum using lambda: " + result);
        sc.close();
    }
}
