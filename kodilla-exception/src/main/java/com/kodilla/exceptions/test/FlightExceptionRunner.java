package com.kodilla.exceptions.test;

public class FlightExceptionRunner {

    public static void main(String[] args) {

        Flight flight1 = new Flight("Katowice", "San Francisco");
        Flight flight2 = new Flight("Bytom", "San Francisco");

        System.out.println(exceptionHandler(flight1));
        System.out.println(exceptionHandler(flight2));

    }

     private static boolean exceptionHandler(Flight flight) {
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(flight);
            return true;
        } catch (RouteNotFoundException e) {
            System.out.println(e);
            return false;
        }
    }
}

