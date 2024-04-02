package Project_1_Email_Application;

/*
This class will print out the specification and the purpose of this project
 */
public class ProjectInstructions {
    public ProjectInstructions(){
        System.out.println("\nSCENARIO:  I am an IT Support Administrator Specialist and being charged with the task of " +
                "creating email accounts for new hires");
        System.out.println("\nMY APPLICATION WILL DO THE FOLLOWING:");
        System.out.print("\uF0B7 Generate an email with the following syntax: firstname.lastname@department.company.com"
                    + "\n\uF0B7 Determine the department (sales, development, accounting), if none leave blank"
                    + "\n\uF0B7 Generate a random String for a password"
                    + "\n\uF0B7 Have set methods to change the password, set the mailbox capacity, and define an " +
                        "alternate email address"
                    + "\n\uF0B7 Have get methods to display the name, email, and mailbox capacity\n\n");
    }
}
