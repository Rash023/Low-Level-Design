package LibraryManagementSystem;

public class Book {
    int id;
    String name;

    String author;

    boolean isAvailable=true;

    public Book(int id,String name,String author){
        this.id=id;
        this.name=name;
        this.author=author;
    }
    public String getAuthor(){
        return this.author;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public boolean isAvailable(){
        return this.isAvailable;
    }

    public void changeAvailability(boolean available){
        this.isAvailable=available;
    }
}

