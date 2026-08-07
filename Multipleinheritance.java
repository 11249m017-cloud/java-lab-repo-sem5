import java.util.Scanner;

// Interface 1
interface Sports {
    void getSportsMarks();
}

// Interface 2
interface Academics {
    void getAcademicMarks();
}

// Class implementing both interfaces
class Student implements Sports, Academics {
    int sportsMarks, academicMarks, total;
    Scanner sc = new Scanner(System.in);

    public void getSportsMarks() {
        System.out.print("Enter Sports Marks: ");
        sportsMarks = sc.nextInt();
    }

    public void getAcademicMarks() {
        System.out.print("Enter Academic Marks: ");
        academicMarks = sc.nextInt();
    }

    void calculateTotal() {
        total = sportsMarks + academicMarks;
    }

    void display() {
        System.out.println("\nStudent Details");
        System.out.println("---------------------");
        System.out.println("Sports Marks   : " + sportsMarks);
        System.out.println("Academic Marks : " + academicMarks);
        System.out.println("Total Marks    : " + total);
    }
}

// Main Class
public class Multipleinheritance{
    public static void main(String[] args) {
        Student s = new Student();

        s.getSportsMarks();
        s.getAcademicMarks();
        s.calculateTotal();
        s.display();
    }
}