package week10;

import java.util.*;
import java.util.stream.*;

public class Week10_Program3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        // sum of squares: 1^2 + 2^2 + ... using streams
        int sumOfSquares = nums.stream()
                               .mapToInt(n -> n * n)
                               .sum();

        System.out.println("Numbers: " + nums);
        System.out.println("Sum of squares (using stream): " + sumOfSquares);

        // alternative: sum of squares of 1..10
        int sum1to10 = IntStream.rangeClosed(1, 10)
                                .map(n -> n * n)
                                .sum();
        System.out.println("Sum of squares from 1 to 10: " + sum1to10);
    }
}

