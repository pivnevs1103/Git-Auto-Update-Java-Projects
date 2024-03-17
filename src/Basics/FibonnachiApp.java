package Basics;

public class FibonnachiApp {
    public static void main(String[] args){

        // Fibonnaci number is defined by the sum of the previous fibinnaci numbers
        // fib(0) = 0
        // fib(1) = 1
        // fib(2) = fib(0) + fib(1) = 0 + 1 = 1
        // fib(3) = fib(2) + fib(1) = 1 + 1 = 2
        System.out.println(fib(4));
    }

    // Recursive method
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        return (fib(n - 1) + fib(n - 2));
    }
}
