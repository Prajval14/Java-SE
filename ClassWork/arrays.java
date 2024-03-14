import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        String[] studentNames = new String[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the names of 10 students:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();
        }
        System.out.println("\nStudent names:");
        for (String name : studentNames) {
            System.out.println(name);
        }
        scanner.close();
    }
}
