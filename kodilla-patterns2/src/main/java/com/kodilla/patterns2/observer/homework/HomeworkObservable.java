package com.kodilla.patterns2.observer.homework;

public interface HomeworkObservable {
    void registerObserver(HomeworkObserver observer);
    void notifyObserver();
    void removeObserver(HomeworkObserver observer);

}
