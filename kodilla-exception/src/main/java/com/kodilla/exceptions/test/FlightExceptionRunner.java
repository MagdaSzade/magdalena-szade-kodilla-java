package com.kodilla.exceptions.test;

public class FlightExceptionRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Bytom", "San Francisco");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}
