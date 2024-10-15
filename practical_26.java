import java.io.*;
import java.util.*;

public class practical_26
{
    public static void main(String[] args) {
        for (String filename : args) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                int lineCount = 0;
                String line;
                while ((line = reader.readLine()) != null) {
                    lineCount++;
                }
                System.out.println(filename + ": " + lineCount + " lines");
            } catch (IOException e) {
                System.err.println("Error reading file " + filename + ": " + e.getMessage());
            }
        }
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}