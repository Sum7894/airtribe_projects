package org.example.library;

import java.util.List;

public class LibraryAdmin {
        private List<Book> books;

        public void addBook(Book book) {
            books.add(book);
        }
        public void removeBook(Book book) {
            books.remove(book);
        }
        public void update(Book book) {
             if (!book.isAvailable()) {
            System.out.println("The book " + book.getTitle() + " is overdue!");
        }
    }

}
