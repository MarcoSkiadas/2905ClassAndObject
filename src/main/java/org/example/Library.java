package org.example;

import java.util.Arrays;

public class Library {

private Book[] books;
private int count;

public Library(int capacity) {
    books = new Book[capacity];
    count = 0;
}
public Book[] getBooks() {
    return books;
}
public void setBooks(Book[] books) {
    this.books = books;
}
public void addBook(Book book) {
    if (count < books.length) {
        books[count] = book;
        count++;
    }

}
public void removeBook(Book book) {
    for (int i = 0; i < books.length; i++) {
        if (books[i].equals(book)) {
            books[i] = null;
        }
    }

}
public void listBooks() {
    for (int i = 0; i < count; i++) {
        System.out.println(books[i]);
    }
}

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
