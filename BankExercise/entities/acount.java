package BankExercise.entities;

public class acount {
    private String titular;
    private  int accountNumber;
    private double startDeposit;

    public acount() {}
    public acount(String titular, int accountNumber,double startDeposit ) {
        this.titular = titular;
        this.accountNumber = accountNumber;
        this.startDeposit = startDeposit;
    }
}
