package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{
    final private String taskName;
    final private String whatToBuy;
    final private double quantity;
    private boolean isDone = false;

    public ShoppingTask(final String taskName,final String whatToBuy,final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
