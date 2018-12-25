package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public final static String SHOPPING = "Shopping Task";
    public final static String PAINTING = "Painting Task";
    public final static String DRIVING = "Driving Task";

    public final Task createTask(String taskType) {
        switch (taskType) {
            case SHOPPING: return new ShoppingTask("shopping task", "danonek", 4);
            case PAINTING: return new PaintingTask("painting task", "pomarańczowy", "ściana");
            case  DRIVING: return new DrivingTask("driving task", "Kraków", "Bus");
            default: return null;
        }
    }


}
