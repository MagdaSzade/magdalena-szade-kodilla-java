package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TASKLIST")
public class TaskList {
    private int id;
    private String listName;
    private String description;

    public TaskList(){
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return this.id;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return this.listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return this.description;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TaskList)) {
            return false;
        }
        TaskList t = (TaskList) o;
        return this.id == t.getId() && this.description == t.getDescription() && this.listName == t.getListName();
    }
}
