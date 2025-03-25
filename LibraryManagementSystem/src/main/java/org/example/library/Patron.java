package org.example.library;

import java.util.List;

public class Patron {
    private String name;
    private String membershipId;
    private List<Book> borrowedBooks;

    public Patron(String name, String membershipId) {
        this.name = name;
        this.membershipId = membershipId;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.borrow();
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.returnBook();
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
