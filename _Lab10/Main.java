public class Main{
    public static void main(String[] args){
        Account data = new Account();
        UserA usA = new UserA(data);
        UserB usB = new UserB(data);
        usA.start();
        usB.start();
    }
}

class Account {
    public int balance;
    private boolean Deposit_Status;
    public Account() {
        this.balance = 0;
        this.Deposit_Status = true;
    }

    synchronized public void Deposit(int balance) {
        if(Deposit_Status == false) {
            try {
                wait();
            } catch (Exception e) {}
        }
        this.balance += balance;
        System.out.println("Deposit " + balance + " Balance: " + this.balance);
        Deposit_Status = false;
        notify();
    }

    synchronized public void Withdraw(int balance) {
        if(Deposit_Status == true) {
            try {
                wait();
            } catch (Exception e) {}
        }
        if(this.balance < balance) {
            System.out.println("Cant Withdraw " + balance + " Balance: " + this.balance);
        } else {
            this.balance -= balance;
            System.out.println("Withdraw " + balance + " Balance: " + this.balance);
        }
        Deposit_Status = true;
        notify();
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

class UserA extends Thread{
    Account data;

    public UserA(Account data) {
        this.data = data;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            data.Deposit((int) (Math.random() * 100));
        }
    }
}

class UserB extends Thread{
    Account data;

    public UserB(Account data) {
        this.data = data;
    }
    
    public void run() {
        for (int i = 0; i < 10; i++) {
            data.Withdraw((int) (Math.random() * 100));
        }
    }
}