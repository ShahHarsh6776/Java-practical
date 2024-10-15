
import java.io.*;

public class practical_30 {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("input.txt");
                FileWriter fileWriter = new FileWriter("output.txt")) {
            int c;
            while ((c = fileReader.read()) != -1) {
                fileWriter.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream("input.txt");
                FileOutputStream fileOutputStream = new FileOutputStream("output_bytes.txt")) {
            int bytesRead;
            byte[] buffer = new byte[1024];
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter writer = new BufferedWriter(new FileWriter("console_output.txt"))) {
            System.out.print("Enter text: ");
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



