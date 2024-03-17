package Labs;

public class BankAccountApp {
    public static void main(String[] args){

        BankAccounts acc1 = new BankAccounts("1234561234", 1000);
        BankAccounts acc2 = new BankAccounts("9876543219", 2000);
        BankAccounts acc3 = new BankAccounts("5431264567", 2500);

        acc1.setName("Connor Bedard");
        System.out.println(acc1.getName());
        acc1.makeDeposit(500);
        acc1.makeDeposit(600);
        acc1.paidBill(1000);
        acc1.accrue();
        System.out.println(acc1.toString());
    }
}

class BankAccounts implements InterfaceInterest{
    // Properties of bank account

    private static int ID = 1001;       // Internal ID, keeping it static because its for the class
    private String accountNumber;       // ID + random 2-digit number + first 2 of the SSN
    private static final String routingNumber = "005400657";
    private String name;
    private String SSN;
    private double balance;

    // Constructor
    public BankAccounts(String SSN, double initialDeposit){
        balance = initialDeposit;
        this.SSN = SSN;
        ID++;
        setAccountNumber();
    }

    private void setAccountNumber(){
        // Generates a random 2 digit number
        int random = (int)(Math.random() * 100);

        // Generating an account number for the user
        accountNumber = ID  + random + SSN.substring(0, 1);

        System.out.println("Your Account Number: " + accountNumber);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void paidBill(double amount){
        balance -= amount;
        System.out.println("You just paid for the Bill in the amount of: $" + amount);
        showBalance();
    }
    public void makeDeposit(double amount){
        balance += amount;
        System.out.println("You just deposited: $" + amount);
        showBalance();
    }
    public void showBalance(){
        System.out.println("Thank you for the Transaction");
        System.out.println("Your current Balance is: $" + balance);
        System.out.println();
    }

    @Override
    public void accrue() {
        balance = balance * (1 + rate/100);
        showBalance();
    }

    @Override
    public String toString() {
        return "BankAccounts{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", SSN='" + SSN + '\'' +
                ", balance=" + balance +
                '}';
    }
}
