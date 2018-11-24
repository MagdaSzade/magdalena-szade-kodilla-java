package com.kodilla.exceptions.test;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException(String comment) {
        super(comment);
    }
}
