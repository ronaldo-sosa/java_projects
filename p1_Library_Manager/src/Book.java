public class Book {
    // VARIABLES
    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;

    // CONSTRUCTOR
    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
        isBorrowed = false;
    }

    // GETTERS AND SETTERS
    // title
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    // author
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    // year
    public void setYear(int year){
        if(year > 0){
            this.year = year;
        }
    }
    public int getYear() {
        return year;
    }

    // isBorrowed
    public boolean isBorrowed(){
        return isBorrowed;
    }

    // LOGIC
    // Book Status
    public boolean borrowBook(){
        if(isBorrowed){
            return false;
        }
        isBorrowed = true;
        return true;
    }

    public boolean returnBook(){
        if(!isBorrowed){
            isBorrowed = false;
        }
        isBorrowed = false;
        return true;
    }
    public void displayInfo(){
        String status = "";
        if(!isBorrowed){
            status = "Available";
        } else{
            status = "Borrowed";
        }
        // System.out.printf("\t\n=BOOK STATUS="+"\t\nTitle: "+title+"\t\nAuthor: "+author+"\t\nYear: "+year+"\n\tStatus: "+status);
        System.out.printf("---------BOOK STATUS---------\n+" +
                            "Title: %s\n"+
                            "tAuthor: %s\n"+
                            "Year: %d\n" +
                            "Status: %s\n"+
                            "----------------------------\n",title,author,year,status);
    }
}
