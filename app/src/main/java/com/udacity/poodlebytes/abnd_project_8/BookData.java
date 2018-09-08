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
        return bookList;
    }//end bookList
}
