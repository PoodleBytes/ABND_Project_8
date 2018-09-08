package com.udacity.poodlebytes.abnd_project_8;

public class Book {

    private String bookTitle;
    private double bookPrice;
    private int bookQty;
    private String bookSupplier;
    private String bookSupplierPhone;

    public Book(String bookTitle, double bookPrice, int bookQty, String bookSupplier, String bookSupplierPhone) {
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.bookQty = bookQty;
        this.bookSupplier = bookSupplier;
        this.bookSupplierPhone = bookSupplierPhone;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public int getBookQty() {
        return bookQty;
    }

    public String getBookSupplier() {
        return bookSupplier;
    }

    public String getBookSupplierPhone() {
        return bookSupplierPhone;
    }
}
