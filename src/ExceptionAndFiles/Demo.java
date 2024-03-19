package ExceptionAndFiles;
/* This is to see how exception work:
Because it is a stack it works its way from the top to the bottom.
So the exception would happen first in the answer() method, then
doMath() method and  then in the main();
 */

public class Demo {
    public static void main(String[] args) {

        System.out.println("Program starts:");
        doMath(12, 0);
        // Won't print this line because of the exception
        System.out.println("Your program is finished");
    }
        public static void doMath(int a, int b){
        answer(a,b);
    }

    public static double answer(int x, int y){
        return x / y;

    }
}
