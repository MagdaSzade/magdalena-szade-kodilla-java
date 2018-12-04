package com.kodilla.good.patterns.flights;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FlightRadarTestSuite {

    @Test
    public void testAllFlightsFromAirport() {
        //Given
        FlightRadar flightRadar = new FlightRadar(new SimpleFlightList());
        ArrayList<Flight> expectedOutput = new ArrayList<>();
        expectedOutput.add(new Flight("Wrocław", "Katowice"));
        expectedOutput.add(new Flight("Wrocław", "Warszawa"));

        //When
        ArrayList<Flight> output = flightRadar.allFlightsFromAirport("Wrocław");

        //Then
        Assert.assertEquals(expectedOutput, output);
    }

    @Test
    public void testAllFlightsFromAirportNonExisting() {
        //Given
        FlightRadar flightRadar = new FlightRadar(new SimpleFlightList());
        ArrayList<Flight> expectedOutput = new ArrayList<>();

        //When
        ArrayList<Flight> output = flightRadar.allFlightsFromAirport("Bytom");

        //Then
        Assert.assertEquals(expectedOutput, output);
    }

    @Test
    public void testAllFlightsToAirport() {
        //Given
        FlightRadar flightRadar = new FlightRadar(new SimpleFlightList());
        ArrayList<Flight> expectedOutput = new ArrayList<>();
        expectedOutput.add(new Flight("Warszawa", "Wrocław"));
        expectedOutput.add(new Flight("Gdańsk", "Wrocław"));

        //When
        ArrayList<Flight> output = flightRadar.allFlightsToAirport("Wrocław");

        //Then
        Assert.assertEquals(expectedOutput, output);
    }

    @Test
    public void testAllFlightsToAirportNonExisting() {
        //Given
        FlightRadar flightRadar = new FlightRadar(new SimpleFlightList());
        ArrayList<Flight> expectedOutput = new ArrayList<>();

        //When
        ArrayList<Flight> output = flightRadar.allFlightsToAirport("Bytom");

        //Then
        Assert.assertEquals(expectedOutput, output);
    }

    @Test
    public void testIsStopoverAvailableTrue() {
        //Given
        FlightRadar flightRadar = new FlightRadar(new SimpleFlightList());

        //When
        boolean output = flightRadar.isStopoverAvailable("Warszawa", "Katowice", "Gdańsk");

        //Then
        Assert.assertTrue(output);
    }

    @Test
    public void testIsStopoverAvailableFalse() {
        //Given
        FlightRadar flightRadar = new FlightRadar(new SimpleFlightList());

        //When
        boolean output = flightRadar.isStopoverAvailable("Gdańsk", "Katowice", "Wrocław");

        //Then
        Assert.assertFalse(output);
    }

    @Test
    public void testIsStopoverAvailableNonExistingAirport() {
        //Given
        FlightRadar flightRadar = new FlightRadar(new SimpleFlightList());

        //When
        boolean output = flightRadar.isStopoverAvailable("Warszawa", "Bytom", "Gdańsk");

        //Then
        Assert.assertFalse(output);
    }
}
