package banking;

public class Main {
    static void main(String[] args) {
        Bank bank = new Bank();

        BankAccount rjsa = new BankAccount("ACC-001", "Ronaldo Sosa");
        BankAccount njms = new BankAccount("ACC-002", "Nathalia Mejía");

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
    }
}
