
import java.util.Scanner;
class week2_program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal (P): "); double P = sc.nextDouble();
        System.out.print("Enter Rate % per year (R): "); double R = sc.nextDouble();
        System.out.print("Enter Time in years (T): "); double T = sc.nextDouble();
        double SI = P * T * R / 100.0, total = P + SI;
        System.out.printf("Simple Interest = %.2f%n", SI);
        System.out.printf("Total Amount = %.2f%n", total);
        sc.close();
    }
}
