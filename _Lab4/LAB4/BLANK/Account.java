package BLANK;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public void deposit(double flag) {
        System.out.println("Deposit " + flag +" to account : " + this.id);
        this.balance += flag;
    }
    public boolean withdraw(double flag) {
        if(this.balance >= flag) {
            this.balance -= flag;
            System.err.println("Withdraw "+ flag +" form account ID : "+ this.id);
            return true;
        }
        return false;
    }

}
