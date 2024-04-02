package Project_3_BankAccount;
// Abstract class means that we cannot create an object from this class

public abstract class  Account  implements IBaseRate {

    // List common properties for savings and checking accounts
    private String name;
    private String SSN;
    private double balance;
    static int index = 10000;
    String accountNumber;
    double rate;

    // Constructor to set base properties and initialize account
    public Account(String name, String SSN, double initDeposit){
        this.name = name;
        this.SSN = SSN;
        balance = initDeposit + 100;

        // Set account number
        index++;
        this.accountNumber = setAccountNumber();

        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoOfSSN = SSN.substring(SSN.length()-2, SSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;

    }
    // List common methods
    public void showInfo(){
        System.out.println(
                "Name: " + name +
                "\nAccount number " + accountNumber +
                "\nBalance: " + balance +
                        "\nRate: " + rate + "%"
        );
    }
}
