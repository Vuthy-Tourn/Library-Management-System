import model.Book;
import model.Member;
import model.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member(1, "Alice");
        Member member2 = new Member(2, "Bob");

        library.registerMember(member1);
        library.registerMember(member2);

        System.out.println("Welcome to the Library Management System!\n");
        System.out.println("Adding Books...");
        System.out.println("Adding Members...\n");

        library.displayBooks();
        System.out.println("\n");
        library.displayMembers();

        System.out.println("\n");
        member2.borrowBook(book1);

        System.out.println("\n");
        library.displayBooks();
        System.out.println("\n");
        library.displayMembers();
        System.out.println("\n");
        member2.returnBook(book1);
        System.out.println("\n");
        library.displayBooks();
        System.out.println("\n");
        library.displayMembers();
        System.out.println("\n");
        System.out.println( library.findBookById(1));
        System.out.println( library.findMemberById(1));
    }
}
