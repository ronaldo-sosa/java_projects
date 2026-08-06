package banking;

public class Main {
    static void main(String[] args) {
        Bank bank = new Bank();

        Customer customer1 = new Customer(1,"Ronaldo Sosa", "ronaldo@email.com");
        Customer customer2 = new Customer(2,"Natalhia Mejia", "natalhia@email.com");
        BankAccount rjsa = new BankAccount("ACC-001", customer1);
        BankAccount njms = new BankAccount("ACC-002", customer2);

        bank.addAccount(rjsa);
        bank.addAccount(njms);

        System.out.println();

        bank.showAccounts();

        System.out.println();

        bank.deposit("ACC-001", 200);
        System.out.println();
        bank.deposit("ACC-002", 400);
        System.out.println();
        bank.showAccounts();
        System.out.println();
        System.out.println("Total accounts: "+bank.getNumberOfAccounts());
        bank.deposit("ACC-dsa", 90);
        bank.deposit("ACC-001", -800);

        bank.transfer("ACC-001", "ACC-002", 300);   // Valid transfer
        bank.transfer("ACC-001", "ACC-002", -50);   // Invalid amount
        bank.transfer("ACC-001", "ACC-002", 5000);  // Insufficient funds
        bank.transfer("ACC-001", "ACC-001", 100);   // Same account
        bank.transfer("ACC-999", "ACC-002", 100);   // Source account not found
        bank.transfer("ACC-001", "ACC-999", 100);   // Destination account not found

        // Testing Transaction
        Transaction transaction = new Transaction(
                TransactionType.DEPOSIT,
                500,
                "Initial Deposit"
        );
        System.out.println(transaction.getType());
        System.out.println(transaction.getAmount());
        System.out.println(transaction.getDate());
        System.out.println(transaction.getDescription());
    }
}
