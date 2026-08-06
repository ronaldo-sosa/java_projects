package banking;
import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        if (account == null) {
            System.out.println("The account cannot be null.");
            return;
        }

        if (findAccount(account.getAccountNumber()) != null){
            System.out.println("An account with that number already exists.");
            return;
        }

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
                    account.getHolder().getName(),
                    account.getBalance()
            );

        }
    }

    public int getNumberOfAccounts(){
        return accounts.size();
    }

    public BankAccount findAccount(String accountNumber){
        if (accountNumber == null || accountNumber.isBlank()) {
            return null;
        }
        for (BankAccount account : accounts){
            if (account.getAccountNumber().equalsIgnoreCase(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public void deposit(String accountNumber, double amount){
        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }
        boolean successful = account.deposit(amount);
        if (successful){
            System.out.println("Deposit successful.");
            System.out.printf("Current balance: $%.2f%n", account.getBalance());
        } else {
            System.out.println("The deposit amount must be greater than $0.00.");
        }
    }

    public void withdraw(String accountNumber, double amount){
        BankAccount account = findAccount(accountNumber);

        if (account == null) {
            System.out.println("Account not found.");
            return;
        }
        boolean successful = account.withdraw(amount);

        if (successful) {
            System.out.println("Withdrawal successful.");
            System.out.printf("Current balance: $%.2f%n", account.getBalance());
        } else if (amount <= 0){
            System.out.println("The withdrawal amount must be greater than $0.00.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void transfer(String sourceAccount, String destinationAccount, double amount){
        BankAccount source = findAccount(sourceAccount);
        BankAccount destination = findAccount(destinationAccount);

        if (source == null) {
            System.out.println("Source account not found.");
            return;
        }

        if (destination == null) {
            System.out.println("Destination account not found.");
            return;
        }

        if (source == destination){
            System.out.println("The source and destination accounts must be different.");
            return;
        }

        if (amount <= 0) {
            System.out.println(
                    "The transfer amount must be greater than $0.00."
            );
            return;
        }

        boolean successful = source.transferOut(amount, destination.getAccountNumber());

        if (!successful){
            System.out.println("Insufficient funds.");
            return;
        }


        destination.transferIn(amount, source.getAccountNumber());
        System.out.println("Transfer completed successfully.");
        System.out.printf("Amount transferred: $%.2f%n", amount);
        System.out.printf("Source account balance: $%.2f%n", source.getBalance());
    }
}
