package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.makeTask("SHOPPING TASK");
        shoppingTask.executeTask();

        //Then
        Assertions.assertEquals("Shopping", shoppingTask.getTaskName());
        Assertions.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.makeTask("PAINTING TASK");
        paintingTask.executeTask();

        //Then
        Assertions.assertEquals("Painting", paintingTask.getTaskName());
        Assertions.assertTrue(paintingTask.isTaskExecuted());

    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.makeTask("DRIVING TASK");
        drivingTask.executeTask();

        //Then
        Assertions.assertEquals("Driving", drivingTask.getTaskName());
        Assertions.assertTrue(drivingTask.isTaskExecuted());

    }
}
