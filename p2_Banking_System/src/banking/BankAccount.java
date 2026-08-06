package banking;

import java.util.ArrayList;

public class BankAccount {
    private final String accountNumber;
    private final Customer holder;
    private double balance;
    private final ArrayList<Transaction> transactions;

    // Constructor
    public BankAccount(String accountNumber, Customer holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    // Getters & Setters
    public String getAccountNumber(){
        return accountNumber;
    }
    public Customer getHolder(){
        return holder;
    }
    public double getBalance(){
        return balance;
    }

    // Methods
    // Deposit
    public boolean deposit(double amount){
        if (amount <= 0){
            return false;
        }
        balance += amount;
        addTransaction(
                TransactionType.DEPOSIT,
                amount,
                "Cash deposit."
        );
        return true;
    }
    // Withdraw
    public boolean withdraw(double amount){
        if (amount <= 0){
            return false;
        }
        if (amount > balance){
            return false;
        }
        balance -= amount;
        addTransaction(
                TransactionType.WITHDRAWAL,
                amount,
                "Cash withdrawal."
        );
        return true;
    }

    private void addTransaction(
            TransactionType type,
            double amount,
            String description
    ){
        Transaction transaction = new Transaction(
                type,
                amount,
                description
        );
        transactions.add(transaction);
    }
    boolean transferOut(double amount, String destinationAccountNumber){
        if (amount <= 0 || amount > balance){
            return false;
        }
        balance -= amount;
        addTransaction(
                TransactionType.TRANSFER_OUT,
                amount,
                "Transfer to account " + destinationAccountNumber
        );
        return true;
    }

    boolean transferIn(double amount, String sourceAccountNumber){
        if(amount <= 0){
            return false;
        }
        balance += amount;
        addTransaction(
                TransactionType.TRANSFER_IN,
                amount,
                "Transfer from account " + sourceAccountNumber
        );
        return true;
    }

    public void showTransactions(){
        if (transactions.isEmpty()){
            System.out.println("No transactions found.");
            return;
        }
        for (Transaction transaction : transactions){
            System.out.printf(
                    "%s | %s | $%.2f | %s%n",
                    transaction.getDate(),
                    transaction.getType(),
                    transaction.getAmount(),
                    transaction.getDescription()
            );
        }
    }
}
