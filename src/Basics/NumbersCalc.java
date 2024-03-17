package Basics;

public class NumbersCalc {
    public static void main(String[] args){

        // Just printing out stuff
        printName();

        // Passing and accepting two numbers and then printing them out
        int numA = 10;
        int numB = 20;
        addNumbers(numA, numB);

        // Passing, accepting and returning numbers after multiplying them
        System.out.println("The product of " + numA + " and " + numB + " is " + multipleNumbers(numA, numB));

    }

    static void printName(){
        System.out.println("My name is Sergey");
    }

    static void addNumbers(int numberA, int numberB){
        // This function will add two numbers;
        int sum = numberA + numberB;
        System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
    }

    static int multipleNumbers(int numberA, int numberB){

        int product = numberA * numberB;
        return product;
    }
}
