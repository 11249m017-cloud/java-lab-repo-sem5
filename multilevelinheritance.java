import java.util.Scanner;

// Level 1 - Student
class Student {
    int rollNo;
    String name;

    void getStudentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
    }
}

// Level 2 - Marks
class Marks extends Student {
    int m1, m2, m3, m4, m5;

    void getMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks in Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        m3 = sc.nextInt();

        System.out.print("Enter Marks in Subject 4: ");
        m4 = sc.nextInt();

        System.out.print("Enter Marks in Subject 5: ");
        m5 = sc.nextInt();
    }
}

// Level 3 - Result
class Result extends Marks {
    int total;
    double average;
    String grade;

    void calculateResult() {
        total = m1 + m2 + m3 + m4 + m5;
        average = total / 5.0;

        if (average >= 90)
            grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "Fail";
    }

    void displayResult() {
        System.out.println("\nStudent Result");
        System.out.println("-------------------------");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Total Marks : " + total);
        System.out.println("Average     : " + average);
        System.out.println("Grade       : " + grade);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Result r = new Result();

        r.getStudentDetails();
        r.getMarks();
        r.calculateResult();
        r.displayResult();
    }
}