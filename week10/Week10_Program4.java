package week10;

import java.util.Optional;

public class Week10_Program4 {
    public static void main(String[] args) {
        Optional<String> maybeName = Optional.ofNullable(null); // try change to Optional.of("Nikshay") to test
        System.out.println("maybeName.isPresent(): " + maybeName.isPresent());

        // ifPresent
        maybeName.ifPresent(name -> System.out.println("Name is: " + name));

        // Provide default
        String nameOrDefault = maybeName.orElse("Default User");
        System.out.println("Name or default: " + nameOrDefault);

        // orElseGet (supplier)
        String nameOrFromSupplier = maybeName.orElseGet(() -> "Generated User");
        System.out.println("Name or from supplier: " + nameOrFromSupplier);

        // map example: transform value if present
        String upper = maybeName.map(String::toUpperCase).orElse("NO NAME");
        System.out.println("Uppercase or fallback: " + upper);

        // Example with non-empty Optional
        Optional<String> actual = Optional.of("Alice");
        actual.ifPresent(n -> System.out.println("Actual name: " + n));
    }
}

