package oop;

public class BankAccount implements InterfaceRate{

    String accountNumber;

    // static > belongs to the CLASS(so its the same for everyone) not the object instance
    // final >> Constant (often static final)
    static final String routingNumber = "12345";

    // Instance variables
    private String name;
    private String ssn;
    String accountType;
    double balance = 0;

    // Constructor Definitions: unique methods
    // 1. They are used to define / setup / initialize properties of an object
    // 2. Constructors are IMPLICITLY  called upon instantiation
    // 3. The same name as the class itself
    // 4. Constructors have N0 return type
    BankAccount(){
        System.out.println("NEW ACCOUNT CREATED");
    }

    // Overloading: call same method name with different arguments
    BankAccount(String accountType){
        System.out.println("NEW ACCOUNT: " + accountType);
    }
    BankAccount(String accountType, double initDeposit){
        // initDeposit, accountType, and msg are all local variables
        System.out.println("NEW ACCOUNT: " + accountType);
        System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
        String msg = null;
        if(initDeposit < 1000){
            msg = "Error: Minimum deposit must be at least $1,000";
        }else{
            msg = "Thanks for your initial deposit of: $" + initDeposit;
        }
        System.out.println(msg);
        balance = initDeposit;
    }

    // Getters / Setters
    // Allow the user to define the name(this was they can assign the name but not actually access the real variable
    public void setName(String name){
        this.name = name ;
    }
    public String getName(){
        return name;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    // Interface methods - you must use them because its like a contract
    public void setRate(){
        System.out.println("Setting Rate");
    }
    public void increaseRate(){
        System.out.println("Increasing Rate");
    }

    // Define methods
    void deposit(double amount){
        balance = balance + amount;
        showActivity("Deposit");
    }

    void withdraw(double amount){
        balance = balance - amount;
        showActivity("Withdraw");
    }

    // This is private so it can only be called from within the class
    private void showActivity(String activity){
        System.out.println("YOUR RECENT TRANSACTION " + activity);
        System.out.println("YOUR NEW BALANCE IS: $ " + balance);
    }

    void checkBalance(){
        System.out.println("Balance: " + balance);
    }

    void getStatus(){

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                '}';
    }
}

