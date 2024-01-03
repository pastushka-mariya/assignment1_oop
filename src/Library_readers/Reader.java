package Library_readers;

import java.util.ArrayList;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + " by " + author;
    }
}

class Reader {
    String fullName;
    int libraryCardNumber;
    String faculty;
    String dateOfBirth;
    String phone;

    public Reader(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, String phone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " took " + numberOfBooks + " books");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " took books: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " took books: ");
        for (Book book : books) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " returned " + numberOfBooks + " books");
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " returned the books: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }
}

class LibraryProgram {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Ablanova Dariya", 12345, "Computer Science", "03-02-2006", "123-456-7890");
        Reader reader2 = new Reader("Alpieva Leila", 67890, "Computer Science", "18-03-2006", "987-654-3210");

        Book book1 = new Book("Adventure Time", "Pendleton Ward");
        Book book2 = new Book("W.I.T.C.H.", "Elisabetta Gnone");
        Book book3 = new Book("Encyclopedia", "Bob Johnson");

        reader1.takeBook(3);
        reader1.takeBook("Adventure Time", "W.I.T.C.H.", "Encyclopedia");
        reader1.takeBook(book1, book2, book3);

        reader2.returnBook(2);
        reader2.returnBook("W.I.T.C.H.", "Encyclopedia");
    }
}

