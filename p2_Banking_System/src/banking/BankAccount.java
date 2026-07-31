package banking;

public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 0;
    }
    // Getters & Setters
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setHolderName(String holderName){
        this.holderName = holderName;
    }
    public String getHolderName(){
        return holderName;
    }
    public double getBalance(){
        return balance;
    }

    // Methods
    // Deposit
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
            System.out.printf("Current balance: $%.2f%n",balance);
        } else{
            System.out.println("The deposit amount should be greater than $0.00.");
        }
    }
    // Withdraw
    public void withdraw(double amount){
        if (amount <= 0){
            System.out.println("The withdraw amount must be greater than $0.00.");
            return;
        }
        if (amount > balance){
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal successful.");
        System.out.printf("Current balance: $%.2f%n",balance);
    }
}
