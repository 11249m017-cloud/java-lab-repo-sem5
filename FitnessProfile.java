
import java.io.*;

public class FitnessProfile {
    public static void main(String[] args) {
        String profile = "Name: Mili\nAge: 20\nFitness Goal: Weight Loss";

        try {
            FileOutputStream fout =
                new FileOutputStream("profile.txt");

            fout.write(profile.getBytes());
            fout.close();

            System.out.println("Profile data written successfully.");

            FileInputStream fin =
                new FileInputStream("profile.txt");

            int i;
            System.out.println("\nUser Profile:");

            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }

            fin.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
