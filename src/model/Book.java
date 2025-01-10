package model;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int id, String title, String author) {
        this.isAvailable = true;
        this.author = author;
        this.title = title;
        this.id = id;
    }

    public void getDetails() {
        String availability = isAvailable ? "Available" : "Not available";
        System.out.println("Book ID: " + id + ", Title: " + title + ", Author: " + author + ", ( " + availability + " )");
    }

    public void borrowBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("Book borrowed: " + title);
        } else{
            System.out.println("Book is not available for borrowing");
        }
    }

    public void returnBook(){
        isAvailable = true;
        System.out.println("Book returned: " + title);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
