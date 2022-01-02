package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String DRIVING_TASK = "DRIVING TASK";

    public Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping", "Milk", 1.00);
            case PAINTING_TASK:
                return new PaintingTask("Painting", "Black", "Horse");
            case DRIVING_TASK:
                return new DrivingTask("Driving", "Far away", "Car" );
            default:
                return null;
        }
    }
}
