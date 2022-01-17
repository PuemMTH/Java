<img src="https://raw.githubusercontent.com/PuemMTH/Java/master/image/JAVA.png" />

## Main.java
```JAVA
import BLANK.Account;
import BLANK.Client;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my program.");
        System.out.println("\nArrayList  ==============================\n");
        ArrayList<Client> AStd = new ArrayList<>();
        AStd.add(new Client(144556677, "Jame Panter", "0811151511"));
        AStd.get(0).AddAccount(new Account(4450123, 20000, 1.5));
        AStd.get(0).AddAccount(new Account(4450124, 30000, 1.5));
        AStd.add(new Client(144556678, "Jame Panter", "0811151511"));
        AStd.get(1).AddAccount(new Account(4550234, 10000, 1.5));
        AStd.get(1).AddAccount(new Account(4550379, 80000, 3.0));
        AStd.get(1).AddAccount(new Account(4550987, 50000, 4.0));
        System.out.println(AStd.get(0).getStrings()+AStd.get(1).getStrings());

        double mex = AStd.get(1).allAccounts.get(0).getBalance();
        AStd.get(1).allAccounts.get(0).withdraw(mex);
        AStd.get(1).allAccounts.get(2).withdraw(mex);
        AStd.get(1).RemoveAccount(AStd.get(1).allAccounts.get(0).getId());
        
        System.out.println("\nArray  ==================================\n");
        
        Client std[] = new Client[2];
        std[0] = new Client(144556677, "Jame Panter", "0811151511");
        std[0].AddAccount(new Account(4450123, 20000, 1.5));
        std[0].AddAccount(new Account(4450295, 90000, 2.0));
        std[1] = new Client(122338899, "Camelo Antony", "0899959599");
        std[1].AddAccount(new Account(4550234, 10000, 1.5));
        std[1].AddAccount(new Account(4550379, 80000, 3.0));
        std[1].AddAccount(new Account(4550987, 50000, 4.0));
        System.out.println(std[0].getStrings()+std[1].getStrings());

        double max = std[1].allAccounts.get(0).getBalance();
        std[1].allAccounts.get(0).withdraw(max);
        std[1].allAccounts.get(2).withdraw(max);
        std[1].RemoveAccount(std[1].allAccounts.get(0).getId());
    }
}
```
## Folder Bank -> Account.java
```JAVA
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
```
## Folder Bank -> Client.java
```JAVA
package BLANK;

import java.util.ArrayList;

public class Client {
	private int id;
    private String name;
    private String phone;
    public ArrayList<Account> allAccounts = new ArrayList<Account>();

    public Client(int id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
        allAccounts = new ArrayList<>();
    }

    public boolean AddAccount(Account account){
        allAccounts.add(account);
        return true;
    }
    
    public boolean RemoveAccount(int accountID){
        for (int i = 0; i < this.allAccounts.size(); i++) {
            if (this.allAccounts.get(i).getId() == accountID) {
                System.out.println("Account ID : " + accountID + " had been removed.");
                this.allAccounts.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public String getStrings() {
        String ans = "";
        ans = "ID : "+this.id +", Name : "+this.name +", TEL : "+this.phone +"\n";
        for(Account account : this.allAccounts){
            ans += "Account ID = "+account.getId() + ", Balance = "+account.getBalance()+", Interest Rate = " + account.getAnnualInterestRate() + "%\n";
        }
        return ans;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getphone() {
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public ArrayList<Account> getAllAccounts() {
        return this.allAccounts;
    }

}
```