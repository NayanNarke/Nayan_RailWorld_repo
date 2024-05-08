package day5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter school name:");
        String schoolName = scanner.nextLine();
        School school = new School(schoolName);

        System.out.println("Enter subject name:");
        String subjectName = scanner.nextLine();
        Subject subject = new Subject(subjectName);

        
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();

        
        System.out.println("Enter student ID:");
        int studentId = scanner.nextInt();
        scanner.nextLine(); 

        Student student = new Student(studentName, studentId, school, null);

        System.out.println(student);

        scanner.close();
    }
}
