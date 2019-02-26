package com.kodilla.exceptions.test;

public class FlightExceptionRunner {

    public static void main(String[] args) {

        Flight flight1 = new Flight("Katowice", "San Francisco");
        Flight flight2 = new Flight("Katowice", "Berlin");
        Flight flight3 = new Flight("Katowice", "Bytom");

        FlightFinder flightFinder = new FlightFinder();
        try {
            System.out.println(flightFinder.findFlight(flight1));
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        try {
            System.out.println(flightFinder.findFlight(flight2));
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        try {
            System.out.println(flightFinder.findFlight(flight3));
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }

    }

}

