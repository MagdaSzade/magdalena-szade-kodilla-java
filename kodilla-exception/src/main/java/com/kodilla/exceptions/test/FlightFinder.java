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
        this.airportsMap.put("Berlin", false);
        this.airportsMap.put("Baku", true);
        this.airportsMap.put("Tokyo", true);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        String arrivalAirport = flight.getArrivalAirport();

        if (this.airportsMap.containsKey(arrivalAirport)) {
            return this.airportsMap.get(arrivalAirport);
        } else {
            throw new RouteNotFoundException("The " + arrivalAirport + " airport is not supported by our Company");
        }
    }
}
