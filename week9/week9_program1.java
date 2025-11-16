package week9;
import java.util.ArrayList;
import java.util.Iterator;

public class week9_program1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Ranjith");
        students.add("Aisha");
        students.add("Carlos");
        students.add("Maya");
        students.add("John");

        System.out.println("=== Print using for-each ===");
        for (String s : students) {
            System.out.println(s);
        }

        System.out.println("\n=== Print using Iterator ===");
        Iterator<String> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
