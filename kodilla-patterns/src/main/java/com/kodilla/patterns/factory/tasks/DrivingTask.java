package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final private String taskName;
    final private String where;
    final private String using;
    private boolean isDone = false;

    public DrivingTask(final String taskName,final String where,final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println(taskName + " is executing...");
        isDone = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isDone;
    }
}
