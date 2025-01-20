package org.example.Model;

public class Book {
    private String bookId;
    private String name;
    private String author;
    private String borrowId;

    public Book(String bookId, String name, String author, String borrowId){
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.borrowId = borrowId;
    }

    public String getBookId() {
        return bookId;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }
};

class main {
    public static void main(String[] args) {
        Book b1 = new Book("1001", "book1", "author1", "borrow1");
        Book b2 = new Book("1002", "book2", "author2", "borrow2");
    }
}
