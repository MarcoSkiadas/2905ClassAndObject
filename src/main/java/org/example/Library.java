package org.example;

import java.util.Arrays;

public class Library {

    private Book[] books;

    @Override
    public String toString() {
        return "Libary{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
