package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car Golf5 = new Car("VW","Golf","Black",2003);
        Golf5.starts();
        Golf5.accelerates(250);
        Car kaefer = new Car("VW","Kaefer","Black",1990);
        kaefer.starts();
        kaefer.accelerates(120);
        Person Thomas = new Person("Thomas",45,"Male");
        Thomas.introduction();

        Book book1 = new Book("111","Avatar","L");
        Book book2 = new Book("222","League","M");
        Book book3 = new Book("333","Daylight","F");



        System.out.println("\n\n"+book1);

        Library library = new Library(3);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("\n\n"+library);

        library.removeBook(book2);

        System.out.println("\n\n"+library);

    }
}