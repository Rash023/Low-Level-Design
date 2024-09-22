package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    List<Book> books=new ArrayList<>();
    List<Student> Students=new ArrayList<>();
    List<Teacher> Teachers=new ArrayList<>();

    public void addBook(Book b){
        books.add(b);
        System.out.println("Book Added to the library");
    }

    public void registerStudent(Student s){
        Students.add(s);
        System.out.println("Student registered successfully");
    }

    public void registerTeacher(Teacher t){
        Teachers.add(t);
        System.out.println("Teacher added successfully");
    }


    public void viewAvailableBooks(){
        System.out.println("Available books in the library");
        for(Book t:books){
            if(t.isAvailable){
                System.out.println("Book ID: " + t.getId() + ", Name: " + t.getName() + ", Author: " + t.getAuthor());
            }
        }
    }
}
