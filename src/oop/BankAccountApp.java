package oop;

public class BankAccountApp {
    public static void main(String[] args){
        // Creating a new Bank account >> think instantiate an object

        BankAccount acc1 = new BankAccount();
        // Cant do this for the variables anymore because it is private
        // acc1.name = "Connor Bedard";
        // With Encapsulation, we set the using a method while keeping the true variable name protected in the other class
        // Encapsulation is all about hiding
        acc1.setName("Connor Bedard");
        System.out.println(acc1.getName());
        acc1.accountNumber = "0123456";
        acc1.balance = 10000;
        acc1.setSsn("1234561234");
        System.out.println("SSN is: " + acc1.getSsn());
        acc1.setRate();
        acc1.setRate();

        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.withdraw(2000);


        System.out.println(acc1.toString());

        BankAccount acc2 = new BankAccount("Checking Account");

        BankAccount acc3 = new BankAccount("Savings Account", 5000);
        acc3.checkBalance();


        // For static variables its all the same and because we made it final you cannot change the value of it
        System.out.println(acc1.routingNumber);
        System.out.println(acc2.routingNumber);
        System.out.println(acc3.routingNumber);

        // Demo for inheritance
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
        // cd1.name = "Matvei Michkov";
        cd1.interestRate = "4.5";
        cd1.accountType = "CD account";
        System.out.println(cd1.toString());
        cd1.coumpound();
    }
}

