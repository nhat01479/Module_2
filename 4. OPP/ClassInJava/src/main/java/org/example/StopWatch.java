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

        sort(a);

        watch.stop();
        System.out.println(Arrays.toString(a));
        System.out.println("Thoi gian sap xep: " + watch.getElapsedTime() + " milliseconds");
    }

    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public StopWatch() {
        this.startTime = LocalTime.now();
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }

    public long getElapsedTime() {
        long times = (endTime.toNanoOfDay() - startTime.toNanoOfDay()) / 1000000;
        return times;
    }

    //    public Duration getElapsedTime() {
//        Duration time = Duration.between(this.startTime, this.endTime);
//        return time;
//    }
// Di voi         System.out.println(watch.getElapsedTime().toMillis());
    public static int[] sortArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int pivot = arr[left + (right - left) / 2];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort(arr, left, j);
        }
        if (i < right) {
            quickSort(arr, i, right);
        }
    }
}

