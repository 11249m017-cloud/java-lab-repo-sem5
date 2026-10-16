
import java.io.*;

public class TextEditor {
    public static void main(String[] args) {
        String content = "Welcome to Java Programming.\n"
                       + "File handling using FileWriter and FileReader.";

        try {
            FileWriter fw = new FileWriter("text.txt");
            fw.write(content);
            fw.close();

            System.out.println("Content written successfully.");

            FileReader fr = new FileReader("text.txt");
            int ch;

            System.out.println("\nFile Content:");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
