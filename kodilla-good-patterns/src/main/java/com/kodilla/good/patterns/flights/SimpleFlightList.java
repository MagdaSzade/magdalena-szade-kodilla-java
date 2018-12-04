package com.kodilla.good.patterns.flights;

import java.util.ArrayList;

public class SimpleFlightList implements FlightList {
    private ArrayList<Flight> flightList = new ArrayList();
    private static final String AIRPORT_KATOWICE = "Katowice";
    private static final String AIRPORT_WARSAW = "Warszawa";
    private static final String AIRPORT_GDANSK = "Gdańsk";
    private static final String AIRPORT_WROCLAW = "Wrocław";


    public SimpleFlightList() {
        flightList.add(new Flight(AIRPORT_KATOWICE, AIRPORT_WARSAW));
        flightList.add(new Flight(AIRPORT_KATOWICE, AIRPORT_GDANSK));
        flightList.add(new Flight(AIRPORT_WARSAW, AIRPORT_GDANSK));
        flightList.add(new Flight(AIRPORT_WARSAW, AIRPORT_KATOWICE));
        flightList.add(new Flight(AIRPORT_WARSAW, AIRPORT_WROCLAW));
        flightList.add(new Flight(AIRPORT_GDANSK, AIRPORT_WARSAW));
        flightList.add(new Flight(AIRPORT_GDANSK, AIRPORT_WROCLAW));
        flightList.add(new Flight(AIRPORT_WROCLAW, AIRPORT_KATOWICE));
        flightList.add(new Flight(AIRPORT_WROCLAW, AIRPORT_WARSAW));
    }

    public ArrayList<Flight> getFlightsList() {
        return new ArrayList<>(flightList);
    }

}
