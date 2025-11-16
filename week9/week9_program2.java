package week9;


import java.util.HashSet;
import java.util.Iterator;

public class week9_program2 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        // add duplicates intentionally
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("HashSet (duplicates removed): " + numbers);

        System.out.println("\nIterating HashSet:");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
