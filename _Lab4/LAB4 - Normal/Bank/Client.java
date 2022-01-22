package Bank;

import java.util.ArrayList;

public class Client {
	private int id;
    private String name;
    private String phone;
    public ArrayList<Account> allAccount = new ArrayList<Account>();

    public Client(int id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
        allAccount = new ArrayList<>();
    }

    public boolean AddAccount(Account account){
        allAccount.add(account);
        return true;
    }

    public boolean RemoveAccount(int accountID){
        for (int i = 0; i < this.allAccount.size(); i++) {
            if (this.allAccount.get(i).getId() == accountID) {
                System.out.println("Account ID : " + accountID + " had been removed.");
                this.allAccount.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public String toString() {
        String ans = "";
        ans = "ID : "+this.id +", Name : "+this.name +", TEL : "+this.phone +"\n";
        for(Account account : this.allAccount){
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
    public ArrayList<Account> getAllAccount() {
        return this.allAccount;
    }

}