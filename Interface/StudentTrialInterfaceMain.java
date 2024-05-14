package Interface;

import java.util.Scanner;

public class StudentTrialInterfaceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of student 1:");
        String name1 = scanner.nextLine();
        System.out.println("Enter marks for subject 1 for student 1:");
        int marks1Sub1 = scanner.nextInt();
        System.out.println("Enter marks for subject 2 for student 1:");
        int marks1Sub2 = scanner.nextInt();

        System.out.println("Enter name of student 2:");
        scanner.nextLine(); // Consume newline
        String name2 = scanner.nextLine();
        System.out.println("Enter marks for subject 1 for student 2:");
        int marks2Sub1 = scanner.nextInt();
        System.out.println("Enter marks for subject 2 for student 2:");
        int marks2Sub2 = scanner.nextInt();

        Student student1 = new Student(name1, new Subject("Subject 1", marks1Sub1), new Subject("Subject 2", marks1Sub2));
        Student student2 = new Student(name2, new Subject("Subject 1", marks2Sub1), new Subject("Subject 2", marks2Sub2));

        int comparisonResult = student1.compareTo(student2);

        // Print comparison result
        if (comparisonResult < 0) {
            System.out.println(student1.getName() + " has less total marks than " + student2.getName() + ".");
        } else if (comparisonResult > 0) {
            System.out.println(student1.getName() + " has more total marks than " + student2.getName() + ".");
        } else {
            System.out.println("Both students have equal total marks.");
        }
    }

}