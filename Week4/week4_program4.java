package Week4;
import java.util.Arrays;
import java.util.Scanner;

public class week4_program4 {
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i; // return first index match
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] data = {10, 25, 30, 45, 60};
        System.out.println("Array: " + Arrays.toString(data));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to search: ");
        int x = sc.nextInt();
        int idx = linearSearch(data, x);
        if (idx >= 0) {
            System.out.println(x + " found at index " + idx);
        } else {
            System.out.println(x + " not found");
        }
        sc.close();
    }
}
