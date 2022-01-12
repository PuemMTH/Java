package BLANK;

import java.util.ArrayList;

public class Client {
    public static Object allAllAccount;
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
        // for(Account account : this.allAccounts){
        //     if(account.getId() == accountID){
        //         this.allAccounts.remove(account);
        //         return true;
        //     }
        // }
        // return false;
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
            ans += "Account ID = "+account.getId() + ", Balance = "+account.getBalance() + ", Interest Rate = "+account.getAnnualInterestRate() + "%\n";
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