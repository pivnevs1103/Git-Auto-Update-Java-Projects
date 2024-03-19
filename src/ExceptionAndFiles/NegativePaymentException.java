package ExceptionAndFiles;
/*
Creating my own exception
Note: It must extend the Exception class

 */
public class NegativePaymentException extends Exception {

    // Define class variable
    double payment;

    // 1.Constructor that takes teh value that would throw the exception
    // 2. Assign value of local variable to class variable
    public NegativePaymentException(double payment){
        //System.out.println("Error: negative payment");
        this.payment = payment;
    }
    // 3. Overriding the toString() method to include the specific exception message
    @Override
    public String toString(){
        return "Error: Cannot take negative payment $" + payment;
    }
}
