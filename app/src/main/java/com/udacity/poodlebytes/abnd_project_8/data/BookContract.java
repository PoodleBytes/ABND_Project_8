package com.udacity.poodlebytes.abnd_project_8.data;

import android.provider.BaseColumns;

/**
 * API Contract for the Books app.
 */
public final class BookContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private BookContract() {
    }

    /**
     * Inner class that defines constant values for the Books database table.
     * Each entry in the table represents a single Book.
     */
    public static final class BookEntry implements BaseColumns {

        /**
         * Name of database table for Books
         */
        public final static String TABLE_NAME = "books";

        /**
         * Unique ID number for the Book (only for use in the database table).
         * <p>
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the Book.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_BOOK_NAME = "title";

        /**
         * price of the Book.
         * <p>
         * Type: INT
         */
        public final static String COLUMN_BOOK_PRICE = "price";

        /**
         * qty of the Book.
         * <p>
         * Type: INT
         */
        public final static String COLUMN_BOOK_QUANTITY = "quantity";

        /**
         * Book Supplier
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_BOOK_SUPPLIER = "supplier";

        /**
         * Supplier PhoneNumber
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_BOOK_SUPPLIER_PHONE = "supplier_phone";

    }
}