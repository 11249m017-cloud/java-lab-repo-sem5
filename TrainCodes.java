import java.util.Scanner;

public class TrainCodes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] trainCodes = {"TN101", "TN102", "TN103", "TN104", "TN105"};

        System.out.print("Enter the index of the train code (0 to 4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Train Code: " + trainCodes[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter an index between 0 and 4.");
        }

        sc.close();
    }
}