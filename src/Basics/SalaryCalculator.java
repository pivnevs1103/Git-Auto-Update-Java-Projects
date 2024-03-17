package Basics;

public class SalaryCalculator {
    public static void main(String[] args){

        // Lets create a variable to define our career

        // Declare a variable
        String career;
        System.out.println("Program is starting");

        // Define a variable
        career = "Software Developer";
        System.out.println("My career: " + career);

        // Declare and Define
        int hoursPerWeek = 40;
        int weekPerYear = 50;
        double rate = 42.50;

        double salary = hoursPerWeek * weekPerYear * rate;
        System.out.println("My salary as a " + career + " at the rate of $"
                + rate + " per hours is $ " + salary + " per year");
    }
}

