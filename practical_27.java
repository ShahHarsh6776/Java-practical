import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class practical_27 {
    public static void main(String[] args) {
      

        char targetChar = args[0].charAt(0);
        String filename = "xanadu.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int charCount = 0;
            int c;
            while ((c = reader.read()) != -1) {
                if ((char) c == targetChar) {
                    charCount++;
                }
            }
            System.out.println("The character '" + targetChar + "' appears " + charCount + " times in the file " + filename);
        } catch (IOException e) {
            System.err.println("Error reading file " + filename + ": " + e.getMessage());
        }
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}
