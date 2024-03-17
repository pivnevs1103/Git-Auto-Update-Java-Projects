package oop;

public class LoanAccount implements InterfaceRate{

    @Override
    public void setRate(){
        System.out.println("Rate");
    }
    @Override
    public void increaseRate(){
        System.out.println("Increase Rate");
    }

    public void setTerm(int terms){
        System.out.println("Setting the term to " + terms + " years." );
    }

    public void setAmortSchedule(){
        System.out.println(" Amortization schedule");
    }

}
