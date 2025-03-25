package org.example.library;

import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    public void lendBook(Patron patron, Book book, LendingStrategy lendingStrategy) {
        if (book.isAvailable()) {
            patron.borrowBook(book);
            lendingStrategy.applyLendingPolicy(patron, book);
        } else {
            System.out.println("The book is currently unavailable.");
        }
    }
}

