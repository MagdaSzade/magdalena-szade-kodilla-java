package com.kodilla.hibernate.manytomany.facade;

public class SearchInDatabaseException extends Exception {

    public static String ERR_NO_RESULT = "No result found.";

    public SearchInDatabaseException (String message) {
        super(message);
    }

}
