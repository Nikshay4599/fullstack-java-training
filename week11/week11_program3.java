package week11;

import java.io.*;

public class week11_program3 {
    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
