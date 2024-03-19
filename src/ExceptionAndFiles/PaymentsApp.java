package ExceptionAndFiles;

import java.sql.SQLOutput;
import java.util.Scanner;
/* This challenge is designed to create my own exception error

 */


// Take a payment from a user
public class PaymentsApp {
    public static void main(String[] args) {

        double payment  = 0;
        //
        boolean positivePayment = true;

        do{
            // 1. Ask the user for input
            System.out.print("Enter the payment amount: ");

            // 2. Get the amount and test the Value
            Scanner scanner = new Scanner(System.in);

            try{
            payment = scanner.nextDouble();
            if(payment < 0){
                // throw the error I created
                throw new NegativePaymentException(payment);
                }else
                    positivePayment = true;
            }catch (NegativePaymentException e){
                System.out.println(e.toString());
                System.out.println();
                System.out.println("Please try again....");
                positivePayment = false;
            }}while(!positivePayment);

        // 4. Print confirmation
        System.out.println("Thank you for the payment of: $" + payment);
    }
}
