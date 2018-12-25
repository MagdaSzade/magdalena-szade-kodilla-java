package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isDone;

    public PaintingTask(String taskName, String color, String whatToPaint) {
    this.taskName = taskName;
    this.color = color;
    this.whatToPaint = whatToPaint;
    this.isDone = false;
    }

    @Override
    public void executeTask() {
        System.out.println("Zadanie: " + this.taskName + " zostało wykonane.");
        isDone = true;
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return this.isDone;
    }
}
