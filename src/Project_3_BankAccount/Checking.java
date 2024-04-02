package Project_3_BankAccount;

public class Checking extends Account {
    // List properties specific to a Checking Account

    private int debitCardNum;
    private int debitCardPin;

    // Constructor to initialize checking account properties
    public Checking(String name, String SSN, double initDeposit){
        super(name, SSN,initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate(){
       rate =  getBaseRate() * .15;
    }

    // List any methods specific to the checking account
    public void setDebitCard(){
        debitCardNum = (int)(Math.random() * Math.pow(10, 12));
        debitCardPin = (int)(Math.random() * Math.pow(10, 4));
    }

    public void showInfo(){
        super.showInfo();
        System.out.println(
                "     Your Checking Account Features:" +
                "\n     Debit Card Number " + debitCardNum +
                "\n     Debit Card Pin " + debitCardPin
        );
    }
}
