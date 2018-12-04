package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightRadar {
    final ArrayList<Flight> flightList;

    public FlightRadar(FlightList flightList) {
        this.flightList = flightList.getFlightsList();
    }

    public ArrayList<Flight> allFlightsFromAirport(String departureAirport) {
        ArrayList<Flight> flightListFrom = new ArrayList<Flight> (this.flightList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList()));
        return flightListFrom;
    }

    public ArrayList<Flight> allFlightsToAirport(String arrivalAirport) {
        ArrayList<Flight> flightListTo = new ArrayList<Flight> (this.flightList.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList()));
        return flightListTo;
    }

    private ArrayList<Flight> findFlight(String departureAirport, String arrivalAirport) {
        ArrayList<Flight> listOfFlights = new ArrayList <> (this.flightList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport) && flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList()));
        return listOfFlights;
    }

    public boolean isStopoverAvailable(String departureAirport, String stopover, String arrivalAirport) {
        if (this.findFlight(departureAirport,stopover).isEmpty()) {
            return false;
        } else {
            if (this.findFlight(stopover, arrivalAirport).isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
