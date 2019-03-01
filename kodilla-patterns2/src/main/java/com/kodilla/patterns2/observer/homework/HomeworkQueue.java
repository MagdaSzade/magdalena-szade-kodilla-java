package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements HomeworkObservable {
    private final String name;
    private final List<String> homeworks;
    private final List<HomeworkObserver> observers;

    public HomeworkQueue(String name) {
        this. name = name;
        homeworks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addHomework(String homework) {
        homeworks.add(homework);
        notifyObserver();
    }

    @Override
    public void registerObserver(HomeworkObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (HomeworkObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(HomeworkObserver observer) {
        observers.remove(observer);
    }
}
