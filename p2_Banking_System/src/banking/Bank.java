package banking;
import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Account created successfully.");
    }

    public void showAccounts(){
        if (accounts.isEmpty()){
            System.out.println("There are no registered accounts.");
            return;
        }
        for (BankAccount account : accounts){
            System.out.printf(
                    "Account: %s | Holder: %s | Balance: $%.2f%n",
                    account.getAccountNumber(),
                    account.getHolderName(),
                    account.getBalance()
            );

        }
    }

    public int getNumberOfAccounts(){
        return accounts.size();
    }

    public BankAccount findAccount(String accountNumber){
        for (BankAccount account : accounts){
            if (account.getAccountNumber().equalsIgnoreCase(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public void deposit(String accountNumber, double amount){
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            return;
        }
        System.out.println("Account not found.");
    }
}
