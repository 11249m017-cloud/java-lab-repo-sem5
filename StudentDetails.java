import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Student Details " + i);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Roll Number: ");
            int rollno = sc.nextInt();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Marks: ");
            float marks = sc.nextFloat();
            sc.nextLine(); // Consume newline

            System.out.println("\nSTUDENT DETAILS");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollno);
            System.out.println("Age: " + age);
            System.out.println("Marks: " + marks);
        }

        sc.close();
    }
}