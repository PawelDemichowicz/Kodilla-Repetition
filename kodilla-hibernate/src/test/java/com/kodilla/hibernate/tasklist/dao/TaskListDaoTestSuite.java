package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "List of tasks to do";

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
}
