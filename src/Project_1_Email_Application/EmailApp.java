package Project_1_Email_Application;

public class EmailApp {
    public static void main(String[] args) {

        new ProjectInstructions();
        Email em1 = new Email("Connor", "Bedard");
        System.out.println(em1.showInfo());

        Email em2 = new Email("Matvei", "Michkob");
        System.out.println(em2.showInfo());

        Email em3 = new Email("Sidney", "Crosby");
        System.out.println(em3.showInfo());

        Email em4 = new Email("Connor", "Mcdavid");
        System.out.println(em4.showInfo());


    }
}
