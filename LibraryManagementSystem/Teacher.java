package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Borrower{
    List<Book> books=new ArrayList<Book>();
    int dayLimit=30;

    int bookCount=5;

    String name;

    public Teacher(String name){
        this.name=name;
    }

    @Override
    public void addBook(Book b) {
        if(this.bookCount>0 && b.isAvailable){
            books.add(b);
            this.bookCount--;
            b.changeAvailability(false);
            System.out.println("Book Added Successfully");
        }
        else{
            System.out.println("Cannot add book,please return the previous books");
        }
    }

    @Override
    public void returnBook(Book b) {
        if(books.remove(b)){
            this.bookCount++;
            System.out.println("Book"+b.name+"returned successfully");
        }
        else{
            System.out.println("Book not found in your borrowed list");
        }
    }

    public void viewBooks(){
        for(Book t:books){
            System.out.println("Book id:"+t.id+" Book Name:"+t.name+" Book Author:"+t.author);
        }
    }

    @Override
    public void getBookCount() {
        System.out.println(books.size());
    }


}
