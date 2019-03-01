package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver{
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println(name + ": New homework in homeworkList "
                + homeworkQueue.getName());
        updateCount++;
    }
}
