package StudentDataBase;

import java.util.Random;

public class Student {

    // Properties
    private String firstName;
    private String lastName;
    private String SSN;
    private static int Id = 1;
    private String phone;
    private String city;
    private String state;
    private String courses = "";
    private static final int courseCost = 800;
    private int balance = 0;

    public Student(String firstName, String lastName,  String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        creatingEmail();
        generatingUserID();
        Id++;
    }

    private void creatingEmail(){
        String email = (firstName + lastName).toLowerCase() + "@brooklyn.cuny.edu";
        System.out.println("Your email address is " + email);

    }
    private void generatingUserID(){
        String userID;
        int randomNumber = new Random().nextInt(1000,9000);
        System.out.println("Generating a User ID: ");
        System.out.print("Please wait");
        System.out.println("................");
        userID = Integer.toString(Id) + randomNumber + SSN.substring(6);
        System.out.println("Your user ID is: " + userID);

    }

    public void enroll(String course){
        this.courses = this.courses + "\n" + course;
        balance += courseCost;
    }
    public void pay(int amount){
        balance -= amount;
        System.out.println("You paid: $ " + amount);
    }

    public void checkBalance(){
        System.out.println("Your balance is: $" + balance);
    }
    public void showCourses(){
        System.out.println(courses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", SSN='" + SSN + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

