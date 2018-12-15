package com.kodilla.spring.portfolio;

import java.util.ArrayList;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addToDoTask(String task) {
        this.toDoList.addTask(task);
    }

    public void addInProgressTask(String task) {
        this.inProgressList.addTask(task);
    }

    public void addDoneTask(String task) {
        this.doneList.addTask(task);
    }

    public ArrayList<String> getToDoList() {
        return toDoList.getTasks();
    }

    public ArrayList<String> getDoneList() {
        return doneList.getTasks();
    }

    public ArrayList<String> getInProgressList() {
        return inProgressList.getTasks();
    }
}
