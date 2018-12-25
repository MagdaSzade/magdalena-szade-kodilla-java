package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;

public class AvailableOptions {
    public ArrayList<String> availableIngredients = new ArrayList<>();
    public ArrayList<String> availableBuns = new ArrayList<>();

    public AvailableOptions() {
        availableIngredients.add("sałata");
        availableIngredients.add("cebula");
        availableIngredients.add("bekon");
        availableIngredients.add("ogórek");
        availableIngredients.add("papryczki chilli");
        availableIngredients.add("pieczarki");
        availableIngredients.add("krewetki");
        availableIngredients.add("ser");

        availableBuns.add("pszenna");
        availableBuns.add("żytnia");
        availableBuns.add("orkiszowa");
    }

    public ArrayList<String> getAvailableIngredients() {
        return new ArrayList<>(this.availableIngredients);
    }

    public ArrayList<String> getAvailableBuns() {
        return new ArrayList<>(this.availableBuns);
    }
}
