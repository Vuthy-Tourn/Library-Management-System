package model;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }
    public void borrowBook(Book book){
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println(name + " borrows \"" + book.getTitle() + "\"...");
        } else {
            System.out.println("Sorry, the book is currently unavailable.");
        }
    }
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " returns \"" + book.getTitle() + "\"...");
        } else {
            System.out.println(name + " hasn't borrowed this book.");
        }
    }

    public void getDetails() {
        System.out.print(id + " - " + name + " (");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed)");
        } else {
            System.out.print("Books borrowed: ");
            for (Book book : borrowedBooks) {
                System.out.print(book.getTitle() + ", ");
            }
            System.out.println(")");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
