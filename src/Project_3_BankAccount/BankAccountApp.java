package Project_3_BankAccount;
public class BankAccountApp {
    public static void main(String[] args) {

        Checking chkacc1 = new Checking("Tom Wilson", "1234567890", 1500);

        Savings savaccc1 = new Project_3_BankAccount.Savings("Connor Bedard", "1234567889", 2500);

        Savings savingsAcc = new Savings("Matvei Michov", "123456781",  20000);

        chkacc1.showInfo();
        System.out.println("**********************************");
        savaccc1.showInfo();

        // Read a CSV File then create new accounts based on that data
    }

}

