package model;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public String findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return("Found book: " + book.getTitle()); // Return the matching book
            }
        }
        return null; // Return null if no book matches
    }


    public String findMemberById(int id) {
        for (Member member : members) {
            if (member.getId() == id) {
                return("Found member: " + member.getName());
            }
        }
        return null;
    }

    public void displayBooks() {
        System.out.println("Displaying All Books:");
        for (Book book : books) {
            book.getDetails();
        }
    }

    public void displayMembers() {
        System.out.println("Displaying All Members:");
        for (Member member : members) {
            member.getDetails();
        }
    }
}

