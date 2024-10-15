import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class practical_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word that you need to find in file: ");
        
        String wordToFind = sc.nextLine(); 

      
        Integer lineNumber = 0; 
        boolean found = false;
        File f=new File("xanadu.txt");
     
        try 
        {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;

            while ((line = br.readLine()) != null) {
              ++lineNumber; 
                if (line.contains(wordToFind)) {
                    System.out.println("Found \"" + wordToFind + "\" in line " + lineNumber + ": " + line);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("The word \"" + wordToFind + "\" was not found in the file.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}
