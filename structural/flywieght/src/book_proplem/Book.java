package book_proplem;

public class Book {
    String name;
    String price;
   BookType type;

    public Book(String name, String price, BookType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
