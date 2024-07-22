package com.assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class TaskScheduler {
    private List<Timer> timers = new ArrayList<>();

    public void scheduleTask(Task task, int interval) {
        Timer timer = new Timer();
        timers.add(timer);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                task.execute();
            }
        }, 0, interval * 1000); // Convert interval to milliseconds
    }

    // Method to stop all scheduled tasks
    public void stopAllTasks() {
        for (Timer timer : timers) {
            timer.cancel();
        }
    }
}

