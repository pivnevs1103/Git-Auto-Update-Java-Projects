package Project_3_BankAccount;

public class Savings extends Account {
    // List properties specific to the Savings Account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize settings for the Savings properties
    public Savings(String name, String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate(){
        rate =  getBaseRate() - .25;
    }

    public void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
    }

    // List any method specific to savings account
    public void showInfo(){
        super.showInfo();
        System.out.println(
                "     Your Savings Account Features:" +
                "\n     Safety Deposit Box ID " + safetyDepositBoxID +
                "\n     Safety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
}
