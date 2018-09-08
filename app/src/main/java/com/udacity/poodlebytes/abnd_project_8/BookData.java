package com.udacity.poodlebytes.abnd_project_8;

import java.util.ArrayList;

public class BookData extends ArrayList {

    private ArrayList<Book> bookList = new ArrayList<>();

    public ArrayList<Book> bookList() {

        bookList.add(new Book(
                "Title 1",
                1.00,
                1,
                "Supplier Book 1",
                "8005551212"));

        bookList.add(new Book(
                "Title 2",
                2.00,
                2,
                "Supplier Book 2",
                "8005552222"));

        bookList.add(new Book(
                "Title 3",
                3.00,
                3,
                "Supplier Book 3",
                "8005553333"));

        bookList.add(new Book(
                "Title 4",
                4.00,
                4,
                "Supplier Book 4",
                "8005554444"));
        return bookList;
    }//end bookList
}
