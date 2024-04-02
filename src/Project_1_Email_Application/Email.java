package Project_1_Email_Application;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "iheartmedia.com";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        // Calling the method asking for the department - it will return the department
        this.department = setDepartment();

        // Calling a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "."
                + companySuffix;
    }

    // Ask for the department
    private String setDepartment(){
        System.out.println("Welcome " + firstName + ", please choice your Department from the following menu" +
                "\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none" +
                "\nEnter Department code: ");

        // Creating my scanner that will take the department chosen by the user
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();

        // A switch statement that will assign the department based on the input
        return switch (depChoice){
            case 0 -> "No department assigned yet";
            case 1 -> "Sales";
            case 2 -> "Development";
            case 3 -> "Accounting";
            default -> "";
        };
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXYZ!@#$%";
        char[] password = new char[length];

        for(int i = 0; i < length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternate emails
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "\nDISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nGENERATED PASSWORD: " + password +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "MB\n" +
                "***************************************************************\n\n";

    }
}
