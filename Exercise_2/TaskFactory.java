package Daily_Schedule;
public class TaskFactory {
    public static Task createTask(String description, String startTime, String endTime, String priority) throws Exception {
        // Validate time format
        if (!TimeValidator.isValidTime(startTime) || !TimeValidator.isValidTime(endTime)) {
            throw new Exception("Error: Invalid time format.");
        }

        // Parse times using TimeValidator
        return new Task(description, startTime, endTime, priority);
    }
}
