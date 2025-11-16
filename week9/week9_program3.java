package week9;

import java.util.HashMap;
import java.util.Map;

public class week9_program3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Ranjith");
        map.put(102, "Aisha");
        map.put(103, "Carlos");
        map.put(104, "Maya");
        map.put(105, "John");

        System.out.println("=== Print key-value pairs ===");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Roll: " + entry.getKey() + " -> Name: " + entry.getValue());
        }
    }
}

