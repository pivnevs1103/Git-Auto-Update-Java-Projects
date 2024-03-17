package oop;

public class CDAccount extends BankAccount implements InterfaceRate{

    String interestRate;

    void coumpound(){
        System.out.println("Compounding interest");
    }
}