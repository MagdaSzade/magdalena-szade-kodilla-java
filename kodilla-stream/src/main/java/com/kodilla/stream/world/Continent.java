package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> countryList;

    public Continent(ArrayList<Country> countryList) {
        this.countryList = new ArrayList<>(countryList);
    }

    public List<Country> getCountryList() {
        return new ArrayList<>(this.countryList);
    }
}
