import book_proplem.Book;
import book_proplem.BookFactory;
import book_proplem.BookType;

public class Main {
    public static void main(String[] args) {
        BookFactory bookFactory= new BookFactory();
        BookType bookType=bookFactory.getType("1","x","y");
        Book book= new Book("first","150",bookType);
    }
}