package com.kodilla.exceptions.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportsMap = new HashMap<>();
        airportsMap.put("London", true);
        airportsMap.put("Monaco", true);
        airportsMap.put("Katowice", true);
        airportsMap.put("Paris", true);
        airportsMap.put("San Francisco", true);
        airportsMap.put("Berlin", true);
        airportsMap.put("Baku", true);
        airportsMap.put("Tokyo", true);
        String arrivalAirport = flight.getArrivalAirport();
        String departureAirport = flight.getDepartureAirport();

        if (airportsMap.containsKey(arrivalAirport)) {
            if (airportsMap.containsKey(departureAirport)) {
                return true;
            } else {
                throw new RouteNotFoundException("The " + departureAirport + " airport is not supported by our Company");
            }
        } else {
            throw new RouteNotFoundException("The" + arrivalAirport + "airport is not supported by our Company");
        }
    }
}
