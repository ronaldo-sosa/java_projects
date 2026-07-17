import java.util.ArrayList;

public class Library {
    // Atributes
    private ArrayList<Book> books;
    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    // Muestra libros
    public void showBooks(){
        if (books.isEmpty()){
            System.out.println("The library is empty.");
            return;
        }
        for (Book book : books) {
            book.displayInfo();
        }
    }
    // Busca libros
    public Book searchBook(String title){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }return null;
    }

    // Presta el libro
    public void borrowBook(String title){
        Book book = searchBook(title);
        if(book==null){
            System.out.println("Book not found.");
            return;
        }
        if(book.borrowBook()){
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("This book is already borrowed.");
        }
    }

    // Regresar libro
    public void returnBook(String title){

        Book book = searchBook(title);

        if(book==null){
            System.out.println("Book not found.");
            return;
        }
        if(book.returnBook()){
            System.out.println("Book returned successfully.");
        } else{
            System.out.println("This book was not borrowed.");
        }
    }

    // Eliminar libro
    public void deleteBook(String title){
        Book book = searchBook(title);
        if(book!=null){
            books.remove(book);
            System.out.println("Book deleted successfully.");
        } else{
            System.out.println("Book not found.");
        }
    }


}
