package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testDrivingTask() {
        //Given
        Task drivingTask = new TaskFactory().createTask(TaskFactory.DRIVING);
        //When
        drivingTask.executeTask();
        String taskName = drivingTask.getTaskName();

        //Then
        Assert.assertEquals("driving task", taskName);
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testShoppingTask() {
        //Given
        Task shoppingTask = new TaskFactory().createTask(TaskFactory.SHOPPING);
        //When
        shoppingTask.executeTask();
        String taskName = shoppingTask.getTaskName();

        //Then
        Assert.assertEquals("shopping task", taskName);
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        Task paintingTask = new TaskFactory().createTask(TaskFactory.PAINTING);
        //When
        //paintingTask.executeTask();
        String taskName = paintingTask.getTaskName();

        //Then
        Assert.assertEquals("painting task", taskName);
        Assert.assertFalse(paintingTask.isTaskExecuted());
    }

}
