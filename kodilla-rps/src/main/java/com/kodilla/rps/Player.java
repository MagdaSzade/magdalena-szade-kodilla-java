package com.kodilla.rps;

public class Player {
    String name;
    int winCounter;

    public void setName(String name) {
        this.name = name;
    }

    public void resetWinCounter() {
        this.winCounter = 0;
    }

    public void addWin() {
        this.winCounter += 1;
    }

    public String getName() {
        return this.name;
    }

    public int getWinCounter() {
        return this.winCounter;
    }
}
