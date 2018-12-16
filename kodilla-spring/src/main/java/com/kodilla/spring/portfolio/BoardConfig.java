package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("taskListToDo")
    TaskList taskListToDo;

    @Autowired
    @Qualifier("taskListInProgress")
    TaskList taskListInProgress;

    @Autowired
    @Qualifier("taskListDone")
    TaskList taskListDone;

    @Bean(name = "taskListToDo")
    public TaskList taskListToDo() {
        return new TaskList();
    }

    @Bean(name = "taskListInProgress")
    public TaskList taskListInProgress() {
        return new TaskList();
    }

    @Bean(name = "taskListDone")
    public TaskList taskListDone() {
        return new TaskList();
    }

    @Bean
    public Board getBoard() {
        return new Board(taskListToDo, taskListInProgress, taskListDone);
    }
}
