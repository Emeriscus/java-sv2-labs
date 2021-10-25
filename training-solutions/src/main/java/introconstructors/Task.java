package introconstructors;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Task {

    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void start() {
        startDateTime = LocalDateTime.now();
    }

    public static void main(String[] args) {

        Task task = new Task("Dolgozat", "1. nap feladatai");

        System.out.println(task.getTitle());
        System.out.println(task.getDescription());
        System.out.println(task.getStartDateTime());
        System.out.println(task.getDuration());

        System.out.println();
        task.setDuration(60);
        System.out.println(task.getDuration());

        task.start();
        System.out.println(task.getStartDateTime());
    }
}
