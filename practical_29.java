import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class practical_29 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java Practical29 <sourceFile> <destinationFile>");
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");

            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        try (FileInputStream in = new FileInputStream(sourceFile);
             FileOutputStream out = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}
