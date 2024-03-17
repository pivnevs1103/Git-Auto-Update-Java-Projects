package StudentDataBase;

public class School {
    public static void main(String[] args){

        Student student1 = new Student("Connor", "Bedard","12345678");
        // Student student2 = new Student("Matvei", "Michkov","9876543211");
        // Student student3 = new Student("Alexander", "Ovechkin","5673451234");

        student1.enroll("English101");
        student1.enroll("Math1201");

        student1.checkBalance();
        student1.showCourses();
        System.out.println(student1.toString());

    }
}

