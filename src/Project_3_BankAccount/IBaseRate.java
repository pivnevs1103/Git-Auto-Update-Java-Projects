package Project_3_BankAccount;

public interface IBaseRate {

    // Works like a contract, like a banker can commit to their application via API and set the rate

    // Write a method that returns the base rate
    default double getBaseRate(){
        return 2.5;
    }
}
