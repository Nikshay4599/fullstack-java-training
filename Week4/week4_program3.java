package Week4;


    
import java.util.Arrays;

public class week4_program3 {
    static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
            i++; j--;
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9, 11};
        System.out.println("Original: " + Arrays.toString(data));
        reverse(data);
        System.out.println("Reversed: " + Arrays.toString(data));
    }
}

