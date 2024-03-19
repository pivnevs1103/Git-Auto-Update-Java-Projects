package ExceptionAndFiles;
/* Going through with how try-catch block works
- There is different exception names for different issues
- You can have more than 1 catch me block
- You can also add "Finally" after the catch method, and it will print regardless whether it catches the
exception or not
 */
public class CommonExceptions {
    public static void main(String[] args){
        int a =5;
        int b = 0;

        // 1. Identify the potential problem area
        // 2. Surround with try-catch block
        try {

            int c = a / b;
        } catch(ArithmeticException e){
            System.out.println("Cannot divide by ZERO");
            System.out.println(e.toString());
        }
        System.out.println("Program is closing");


        String[] states = { "CA", "TX", "FL", "NY"};

        for(int i = 0; i <= states.length; i++){

            try{
                System.out.println(states[i]);
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error: Index outside of the array domain");
                System.out.println(e.toString());
            } finally{
                System.out.println("Iterating through array");
            }
        }
    }
}
