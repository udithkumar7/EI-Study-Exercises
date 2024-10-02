package Daily_Schedule;
import java.time.LocalTime;

public class Task {
    private String description;
    private LocalTime startTime;
    private LocalTime endTime;
    private String priority;
    private boolean completed;

    public Task(String description, String startTime, String endTime, String priority) {
        this.description = description;
        this.startTime = LocalTime.parse(startTime);
        this.endTime = LocalTime.parse(endTime);
        this.priority = priority;
        this.completed = false;  // Default to not completed
    }

    // Getter and Setter methods
    public String getDescription() {
        return description;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return startTime + " - " + endTime + ": " + description + " [" + priority + "]" + (completed ? " (Completed)" : "");
    }
}
