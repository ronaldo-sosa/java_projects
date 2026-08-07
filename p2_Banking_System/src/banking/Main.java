package banking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while(running) {
            System.out.println("""
                    ---------------------
                          BANK SYSTEM
                    ---------------------
                    Choose an option:
                    1. Create account
                    2. Deposit cash
                    3. Withdraw cash
                    4. Money transfer
                    5. Show accounts
                    6. Show transactions
                    7. Exit app
                    
                    Option:
                    """);
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: {
                    System.out.println("=== CREATE ACCOUNT ===");
                    System.out.print("Customer ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Customer name: ");
                    String name = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Account number: ");
                    String accountNumber = scanner.nextLine();

                    Customer customer = new Customer(id, name, email);
                    bank.createAccount(accountNumber, customer);

                    break;
                }
                case 2: {
                    System.out.println("===== DEPOSIT =====");
                    System.out.print("Account number: ");
                    String accountNumber = scanner.nextLine();

                    System.out.print("Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    bank.deposit(accountNumber, amount);
                    break;
                }
                case 3: {
                    System.out.println("===== WITHDRAW =====");
                    System.out.print("Account number: ");
                    String accountNumber = scanner.nextLine();

                    System.out.print("Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    bank.withdraw(accountNumber, amount);
                    break;
                }
                case 4:{
                    System.out.println("===== TRANSFER =====");
                    System.out.print("Source account: ");
                    String source = scanner.nextLine();

                    System.out.print("Destination account: ");
                    String destination = scanner.nextLine();

                    System.out.print("Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    bank.transfer(source, destination, amount);
                    break;
                }
                case 5: {
                    System.out.println("===== ACCOUNTS =====");
                    bank.showAccounts();
                    break;
                }
                case 6: {
                    System.out.println("===== TRANSACTION HISTORY =====");

                    System.out.print("Account number: ");
                    String accountNumber = scanner.nextLine();

                    bank.showTransactions(accountNumber);
                    break;
                }

                case 7: {
                    running = false;
                    System.out.println("Thank you for using this app!");
                    break;
                }

                default: {
                    System.out.println("Choose a valid option.");
                }
            }
        }
        scanner.close();
    }
}
