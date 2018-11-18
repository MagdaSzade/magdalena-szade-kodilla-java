package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        Country polska = new Country(new BigDecimal("38000000"));
        Country czechy = new Country(new BigDecimal("10000000"));
        Country niemcy = new Country(new BigDecimal("82000000"));
        Country wlochy = new Country(new BigDecimal("60000000"));
        Country portugalia = new Country(new BigDecimal("10000000"));
        ArrayList<Country> europaCountryList = new ArrayList<>();
        europaCountryList.add(polska);
        europaCountryList.add(czechy);
        europaCountryList.add(niemcy);
        europaCountryList.add(wlochy);
        europaCountryList.add(portugalia);
        Continent europa = new Continent(europaCountryList);

        Country USA = new Country(new BigDecimal("325000000"));
        Country kanada = new Country(new BigDecimal("36000000"));
        ArrayList<Country> amerykaNorthCountryList = new ArrayList<>();
        amerykaNorthCountryList.add(USA);
        amerykaNorthCountryList.add(kanada);
        Continent northAmerica = new Continent(amerykaNorthCountryList);

        Country brazylia = new Country(new BigDecimal("210000000"));
        Country chile = new Country(new BigDecimal("18000000"));
        Country argentyna = new Country(new BigDecimal("40000000"));
        Country ekwador = new Country(new BigDecimal("16000000"));
        ArrayList<Country> southAmericaCountryList = new ArrayList<>();
        southAmericaCountryList.add(brazylia);
        southAmericaCountryList.add(chile);
        southAmericaCountryList.add(argentyna);
        southAmericaCountryList.add(ekwador);
        Continent southAmerica = new Continent(southAmericaCountryList);

        ArrayList<Continent> worldContinentList = new ArrayList<>();
        worldContinentList.add(europa);
        worldContinentList.add(northAmerica);
        worldContinentList.add(southAmerica);
        World world = new World(worldContinentList);

        BigDecimal peopleQuantity = new BigDecimal("845000000");
        Assert.assertEquals(peopleQuantity, world.getPeopleQuantity());
    }
}
