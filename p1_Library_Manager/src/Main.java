import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while(true){
            // MENÚ
            System.out.println("""
                    ===== PERSONAL LIBRARY =====
                    
                    1. Add Book
                    2. Show Books
                    3. Search Book
                    4. Borrow Book
                    5. Return Book
                    6. Delete Book
                    7. Exit
                    
                    Option:
                    """);

            // READ OPTION
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                // Add Book
                case 1: {
                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Author: ");
                    String author = scanner.nextLine();

                    System.out.print("Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    Book book = new Book(title, author, year);
                    library.addBook(book);
                    System.out.println("Book added successfully.");
                    break;
                }
                // Show Books
                case 2: {
                    library.showBooks();
                    break;
                }
                // Search Book
                case 3: {
                    System.out.print("Title to search: ");
                    String title = scanner.nextLine();

                    Book foundBook = library.searchBook(title);

                    if (foundBook != null) {
                        foundBook.displayInfo();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                }
                // Borrow Book
                case 4: {
                    System.out.print("Title to borrow: ");
                    String title = scanner.nextLine();

                    library.borrowBook(title);
                    break;
                }
                // Return Book
                case 5: {
                    System.out.print("Title to return: ");
                    String title = scanner.nextLine();
                    library.returnBook(title);
                    break;
                }
                // Delete Book
                case 6: {
                    System.out.print("Title to delete: ");
                    String title = scanner.nextLine();
                    library.deleteBook(title);
                    break;
                }
                // Exit
                case 7: {
                    System.out.println("Thank you!");
                    scanner.close();
                    return;
                }
                default: {
                    System.out.println("Please, choose a valid option.");
                    break;
                }
            }
            System.out.println();
        }
    }
}
