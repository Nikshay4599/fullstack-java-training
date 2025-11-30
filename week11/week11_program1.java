package week11;
import java.io.*;

public class week11_program1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;

            System.out.println("Reading file content:\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

