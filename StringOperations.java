import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int choice;

        do {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Find Length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Reverse String");
            System.out.println("5. Compare Strings");
            System.out.println("6. Concatenate Strings");
            System.out.println("7. Find Character at Position");
            System.out.println("8. Check Equality");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Length of first string: " + str1.length());
                    break;

                case 2:
                    System.out.println("Uppercase: " + str1.toUpperCase());
                    break;

                case 3:
                    System.out.println("Lowercase: " + str1.toLowerCase());
                    break;

                case 4:
                    String reverse = "";
                    for (int i = str1.length() - 1; i >= 0; i--) {
                        reverse = reverse + str1.charAt(i);
                    }
                    System.out.println("Reverse: " + reverse);
                    break;

                case 5:
                    int result = str1.compareTo(str2);

                    if (result == 0)
                        System.out.println("Strings are equal");
                    else if (result > 0)
                        System.out.println("First string is greater");
                    else
                        System.out.println("Second string is greater");
                    break;

                case 6:
                    System.out.println("Concatenated String: " + str1.concat(str2));
                    break;

                case 7:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();

                    if (pos >= 0 && pos < str1.length())
                        System.out.println("Character: " + str1.charAt(pos));
                    else
                        System.out.println("Invalid position");
                    break;

                case 8:
                    if (str1.equals(str2))
                        System.out.println("Strings are equal");
                    else
                        System.out.println("Strings are not equal");
                    break;

                case 9:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 9);

        sc.close();
    }
}