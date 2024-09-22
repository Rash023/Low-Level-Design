package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public interface Borrower {
    List<Book> books=new ArrayList<>();
    int dayLimit=0;
    int bookCount=0;


    public void addBook(Book b);

    public void returnBook(Book b);

    public void viewBooks();

    public void getBookCount();


}
