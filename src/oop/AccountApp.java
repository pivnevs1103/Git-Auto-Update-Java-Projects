package oop;

public class AccountApp {
    public static void main(String[] args) {


        LoanAccount la = new LoanAccount();
        la.increaseRate();
        la.setRate();
        la.setAmortSchedule();
        la.setTerm(20);

        // Polymorphism changes where we are pointing
        InterfaceRate account1 = new LoanAccount();
        account1.setRate();
    }
}