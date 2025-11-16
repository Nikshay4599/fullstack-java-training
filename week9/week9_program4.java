package week9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class week9_program4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice"); list.add("Bob"); list.add("Charlie");

        HashSet<Integer> set = new HashSet<>();
        set.add(1); set.add(2); set.add(3);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple"); map.put(2, "Banana"); map.put(3, "Cherry");

        // ArrayList: for-each and Iterator
        System.out.println("ArrayList - for-each:");
        for (String s : list) System.out.println(s);

        System.out.println("ArrayList - Iterator:");
        Iterator<String> lit = list.iterator();
        while (lit.hasNext()) System.out.println(lit.next());

        // HashSet: for-each and Iterator
        System.out.println("\nHashSet - for-each:");
        for (Integer i : set) System.out.println(i);

        System.out.println("HashSet - Iterator:");
        Iterator<Integer> sit = set.iterator();
        while (sit.hasNext()) System.out.println(sit.next());

        // HashMap: keys, values, entrySet
        System.out.println("\nHashMap - keys:");
        for (Integer k : map.keySet()) System.out.println(k);

        System.out.println("HashMap - values:");
        for (String v : map.values()) System.out.println(v);

        System.out.println("HashMap - entries:");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}

