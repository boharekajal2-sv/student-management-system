import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> students = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choice = sc.nextLine();

            if (choice.equals("1")) {

                System.out.print("Enter Student ID: ");
                String id = sc.nextLine();

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Student Age: ");
                String age = sc.nextLine();

                System.out.print("Enter Student Course: ");
                String course = sc.nextLine();

                String[] student = {id, name, age, course};
                students.add(student);

                System.out.println("Student added successfully!");

            } else if (choice.equals("2")) {

                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {
                    for (String[] s : students) {
                        System.out.println("\nStudent ID: " + s[0]);
                        System.out.println("Name: " + s[1]);
                        System.out.println("Age: " + s[2]);
                        System.out.println("Course: " + s[3]);
                        System.out.println("----------------------");
                    }
                }

            } else if (choice.equals("3")) {
                System.out.println("Thank you!");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}