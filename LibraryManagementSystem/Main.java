package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {

        LibraryManager library=new LibraryManager();
        //creating book objects
        Book b1 = new Book(1, "The Song of Achilles", "Madeline Miller");
        Book b2 = new Book(2, "Dune", "Frank Herbert");
        Book b3 = new Book(3, "The Power of Habit", "Charles Duhigg");
        Book b4 = new Book(4, "Where the Crawdads Sing", "Delia Owens");
        Book b5 = new Book(5, "The Night Circus", "Erin Morgenstern");
        Book b6 = new Book(6, "Sapiens: A Brief History of Humankind", "Yuval Noah Harari");
        Book b7 = new Book(7, "Educated", "Tara Westover");
        Book b8 = new Book(8, "Atomic Habits", "James Clear");
        Book b9 = new Book(9, "The Girl on the Train", "Paula Hawkins");
        Book b10 = new Book(10, "Gone Girl", "Gillian Flynn");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);
        library.addBook(b6);
        library.addBook(b7);
        library.addBook(b8);
        library.addBook(b9);
        library.addBook(b10);


        Student s1=new Student("Rashid");
        Teacher t1=new Teacher("Banchhanidhi Dash");
        library.registerStudent(s1);
        library.registerTeacher(t1);

        library.viewAvailableBooks();

        s1.addBook(b1);
        s1.addBook(b2);
        s1.addBook(b3);
        s1.addBook(b7);

        s1.viewBooks();

        library.viewAvailableBooks();


    }
}
