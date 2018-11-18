package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> continentsList;

    public World(ArrayList<Continent> continentsList) {
        this.continentsList = new ArrayList<>(continentsList);
    }

    public ArrayList<Continent> getContinentList() {
        return new ArrayList<>(this.continentsList);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = this.continentsList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return peopleQuantity;
    }
}
