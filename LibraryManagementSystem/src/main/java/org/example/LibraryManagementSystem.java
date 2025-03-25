package org.example;

import org.example.library.*;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryAdmin admin = new LibraryAdmin();

        // Create books using the factory
        Book book1 = new Book("Ready Study Go!", "Bawa & Dinesh", "1234567890");
        Book book2 = new Book("Sita", "Bhanumathi", "0987654321");

        // Add books to the library
        admin.addBook(book1);
        admin.addBook(book2);

        // Register patrons
        Patron patron = new Patron("John Doe", "P001");

        // Lend books
        library.lendBook(patron, book1, new DefaultLendingStrategy());  // 2 weeks
    }
}
