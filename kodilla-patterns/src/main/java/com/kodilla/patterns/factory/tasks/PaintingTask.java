package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    final private String taskName;
    final private String color;
    final private String whatToPaint;
    private boolean isDone = false;

    public PaintingTask(final String taskName,final String color,final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
