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