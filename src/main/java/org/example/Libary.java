package org.example;

import java.util.Arrays;

public class Libary {

    private Book[] books;

    @Override
    public String toString() {
        return "Libary{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
