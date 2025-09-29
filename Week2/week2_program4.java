package Week2;

public class week2_program4 {
    
}
import java.util.Scanner;
class week2_program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: "); int a = sc.nextInt();
        System.out.print("Enter b: "); int b = sc.nextInt();
        System.out.println("Before swap: a=" + a + ", b=" + b);
        a = a ^ b; b = a ^ b; a = a ^ b;
        System.out.println("After  swap: a=" + a + ", b=" + b);
        sc.close();
    }
}

