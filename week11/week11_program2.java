package week11;

import java.io.*;
import java.util.*;

public class week11_program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

            System.out.println("Enter text (type 'exit' to stop):");

            while (true) {
                String input = sc.nextLine();

                if (input.equalsIgnoreCase("exit"))
                    break;

                bw.write(input);
                bw.newLine();
            }

            bw.close();
            System.out.println("Data written to output.txt");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        sc.close();
    }
}
