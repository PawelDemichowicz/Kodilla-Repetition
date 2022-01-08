package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "List of tasks to do";
    private static final String LASTNAME = "To Do";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("ToDo", DESCRIPTION);
        taskListDao.save(taskList);
        int id = taskList.getId();
        String listName = taskList.getListName();

        //When
        List<TaskList> readList = taskListDao.findByListName(listName);

        //Then
        Assertions.assertEquals(1,readList.size());

        //CleanUp
        taskListDao.deleteById(id);
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tdf = new TaskFinancialDetails(new BigDecimal(5), false);
        TaskFinancialDetails tdf2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tdf);
        task2.setTaskFinancialDetails(tdf2);
        TaskList taskList = new TaskList(LASTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assertions.assertNotEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id);
    }
}
