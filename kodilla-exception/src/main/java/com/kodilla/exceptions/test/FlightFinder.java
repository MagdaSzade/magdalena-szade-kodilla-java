package com.kodilla.exceptions.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Map<String, Boolean> airportsMap = new HashMap<>();


    public FlightFinder() {
        this.airportsMap.put("London", true);
        this.airportsMap.put("Monaco", true);
        this.airportsMap.put("Katowice", true);
        this.airportsMap.put("Paris", true);
        this.airportsMap.put("San Francisco", true);
        this.airportsMap.put("Berlin", true);
        this.airportsMap.put("Baku", true);
        this.airportsMap.put("Tokyo", true);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        String arrivalAirport = flight.getArrivalAirport();
        String departureAirport = flight.getDepartureAirport();

        if (this.airportsMap.containsKey(arrivalAirport)) {
            if (this.airportsMap.containsKey(departureAirport)) {
                return true;
            } else {
                throw new RouteNotFoundException("The " + departureAirport + " airport is not supported by our Company");
            }
        } else {
            throw new RouteNotFoundException("The " + arrivalAirport + " airport is not supported by our Company");
        }
    }
}
