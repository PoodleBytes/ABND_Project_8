package com.udacity.poodlebytes.abnd_project_8;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.udacity.poodlebytes.abnd_project_8.data.BookContract.BookEntry;
import com.udacity.poodlebytes.abnd_project_8.data.BookDbHelper;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity";

    /**
     * Database helper that will provide us access to the database
     */
    private BookDbHelper dBHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dBHelper = new BookDbHelper(this);
        Log.i(TAG, "JR On Create");
        insertBook();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    private void insertBook() {
        Log.i(TAG, "JR InsertBook");
        // Book array_of_books = new Book;
        //ArrayList<Book> newBooks = new ArrayList<>();


        // Gets the database in write mode
        SQLiteDatabase db = dBHelper.getWritableDatabase();

        // Create a ContentValues object where column names are the keys,
        // and Toto's pet attributes are the values.
        ContentValues values = new ContentValues();
        values.put(BookEntry.COLUMN_BOOK_NAME, "Name 1");
        values.put(BookEntry.COLUMN_BOOK_PRICE, 1.00);
        values.put(BookEntry.COLUMN_BOOK_QUANTITY, 0);
        values.put(BookEntry.COLUMN_BOOK_SUPPLIER, "Supplier 1");
        values.put(BookEntry.COLUMN_BOOK_SUPPLIER_PHONE, "8005551212");

        // Insert a new row for Toto in the database, returning the ID of that new row.
        // The first argument for db.insert() is the Books table name.
        // The second argument provides the name of a column in which the framework
        // can insert NULL in the event that the ContentValues is empty (if
        // this is set to "null", then the framework will not insert a row when
        // there are no values).
        // The third argument is the ContentValues object containing the info for Toto.
        long newRowId = db.insert(BookEntry.TABLE_NAME, null, values);
        Log.i(TAG, "add data result: " + newRowId);
    }
}
