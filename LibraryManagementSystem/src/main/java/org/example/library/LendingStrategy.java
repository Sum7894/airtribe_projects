package org.example.library;

public interface LendingStrategy {
    void applyLendingPolicy(Patron patron, Book book);
}

