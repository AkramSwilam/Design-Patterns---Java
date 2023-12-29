package book_proplem;

import java.util.HashMap;

public class BookFactory {
    HashMap<String,BookType> bookTypes=new HashMap<>();
   public BookType getType(String type, String distributor, String other){
        if(bookTypes.get(type)==null)
            bookTypes.put(type,new BookType(type,distributor,other));
        return bookTypes.get(type);
    }
}
