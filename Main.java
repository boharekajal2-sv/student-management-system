import java.util.ArrayList;
import java.util.Scanner;

// Student class to hold student details
class Student {
    String name;
    int age;
    String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Name: " + name + " | Age: " + age + " | Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                // Add Student
                System.out.print("Enter Student Name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter Student Age: ");
                int age = Integer.parseInt(scanner.nextLine());
                
                System.out.print("Enter Student Course: ");
                String course = scanner.nextLine();

                students.add(new Student(name, age, course));
                System.out.println("Student added successfully!");

            } else if (choice.equals("2")) {
                // View Students
                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {
                    System.out.println("\n--- Student List ---");
                    for (Student s : students) {
                        s.display();
                    }
                }

            } else if (choice.equals("3")) {
                // Search Student
                System.out.print("Enter Student Name to search: ");
                String searchName = scanner.nextLine();
                boolean found = false;

                for (Student s : students) {
                    if (s.name.equalsIgnoreCase(searchName)) {
                        System.out.println("Student found!");
                        s.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found!");
                }

            } else if (choice.equals("4")) {
                // Exit
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }
        
        scanner.close();
    }
}