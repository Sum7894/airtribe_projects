package org.example.library;


public class DefaultLendingStrategy implements LendingStrategy{

    @Override
    public void applyLendingPolicy(Patron patron, Book book) {
        // Default lending policy, 2 weeks borrow period
        System.out.println("Book borrowed for 2 weeks.");
    }
}
