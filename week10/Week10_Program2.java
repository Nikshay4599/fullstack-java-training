package week10;
import java.util.*;
import java.util.stream.Collectors;

public class Week10_Program2 {
    public static void main(String[] args) {
        // Example static list (you can replace this with input logic)
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evens = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("Even numbers (using stream): " + evens);

        // Optional: interactive input example
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String line = sc.nextLine();
        List<Integer> nums = Arrays.stream(line.trim().split("\\s+"))
                                   .map(Integer::parseInt)
                                   .collect(Collectors.toList());
        List<Integer> evens2 = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Evens from your input: " + evens2);
        sc.close();
        */
    }
}

