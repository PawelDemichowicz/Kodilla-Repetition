package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        toDoList.getTasks().add("Task1");
        inProgressList.getTasks().add("Task2");
        doneList.getTasks().add("Task3");

        //Then
        Assertions.assertEquals(toDoList.getTasks().get(0), "Task1");
        Assertions.assertEquals(inProgressList.getTasks().get(0), "Task2");
        Assertions.assertEquals(doneList.getTasks().get(0), "Task3");
    }
}
