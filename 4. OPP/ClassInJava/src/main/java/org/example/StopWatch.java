package org.example;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Locale;

public class StopWatch {
    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
//        System.out.println(Arrays.toString(a));

        StopWatch watch = new StopWatch();
        watch.start();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        watch.stop();
        System.out.println(Arrays.toString(a));
        System.out.println(watch.getElapsedTime().toMillis());
    }

    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void StopWatch() {
        this.startTime = LocalTime.now();
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }

    public Duration getElapsedTime() {
        Duration time = Duration.between(this.startTime, this.endTime);
        return time;
    }
}

