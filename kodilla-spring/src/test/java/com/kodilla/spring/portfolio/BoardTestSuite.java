package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.addDoneTask("done");
        board.addToDoTask("to do");
        board.addInProgressTask("in progress");
        //Then
        Assert.assertEquals("done", board.getDoneList().get(0));
        Assert.assertEquals("to do", board.getToDoList().get(0));
        Assert.assertEquals("in progress", board.getInProgressList().get(0));
    }
}
