package Project_2_Student_Database;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

       // Ask how many new students we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();

        Student[] students = new Student[numOfStudents];

       // Create n number of students
       for(int n = 0; n < numOfStudents;n++) {
           students[n] = new Student();
           students[n].enroll();
           students[n].payTuition();
           System.out.println(students[n].toString());
       }
    }
}
