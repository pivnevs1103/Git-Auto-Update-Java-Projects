package Project_2_Student_Database;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


    // Constructor prompt user to enter student's name and year
    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Please enter your last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = scanner.nextInt();

        setStudentID();
    }

    // Generate an ID
    private void setStudentID(){
        // Grade Level + ID;
        id++;
        this.studentId =  gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll(){
            // Get inside a loop, until a user hits 0 to quit
        do{
            System.out.print("Enter course to enroll(press Q once you are done to quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();

            if(!course.equals("Q")) {
                courses = courses + "\n   " + course;
                tuitionBalance += costOfCourse;
            }else {
                break;
            }
        }while (1 != 0);
    }

    // View balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Please enter your payment: $");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank for your payment of $" + payment);
        viewBalance();
    }
    // Shows status
    @Override
    public String toString(){

        return "\n\nName: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentId +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance + "\n"
                + "______________________________________\n\n";
    }
}
