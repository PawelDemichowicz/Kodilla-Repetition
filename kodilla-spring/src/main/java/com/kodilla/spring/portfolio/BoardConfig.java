package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(toDoListMaker(), inProgressListMaker(), doneListMaker());
    }

    @Bean
    public TaskList toDoListMaker() {
        return new TaskList();
    }

    @Bean
    public TaskList inProgressListMaker() {
        return new TaskList();
    }

    @Bean
    public TaskList doneListMaker() {
        return new TaskList();
    }
}
