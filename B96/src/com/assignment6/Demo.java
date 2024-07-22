package com.assignment6;

public class Demo {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Schedule task 1 to run every 2 seconds
        scheduler.scheduleTask(() -> System.out.println("Task 1 executed"), 1);

        // Schedule task 2 to run every 3 seconds
        scheduler.scheduleTask(() -> System.out.println("Task 2 executed"), 2);

        // Schedule task 3 to run every 5 seconds
        scheduler.scheduleTask(() -> System.out.println("Task 3 executed"), 1);

        // Let the tasks run for a while then stop all tasks
        try {
            Thread.sleep(20000); // Run for 20 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduler.stopAllTasks();
        System.out.println("All tasks stopped.");
    }
}

