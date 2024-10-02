package Daily_Schedule;
import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;

    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    // Add a new task
    public void addTask(Task task) throws Exception {
        Task conflictingTask = getConflictingTask(task);
        if (conflictingTask == null) {
            tasks.add(task);
            System.out.println("Task added successfully. No conflicts.");
        } else {
            throw new Exception("Error: Task conflicts with existing task \"" + conflictingTask.getDescription() + "\".");
        }
    }

    // Remove an existing task
    public void removeTask(String description) {
        Task taskToRemove = findTaskByDescription(description);

        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Error: Task not found.");
        }
    }

    // View all tasks sorted by start time
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
            return;
        }
        tasks.sort((t1, t2) -> t1.getStartTime().compareTo(t2.getStartTime()));
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    // Edit an existing task
    public void editTask(String description, String newDescription, String newStartTime, String newEndTime, String newPriority) throws Exception {
        Task taskToEdit = findTaskByDescription(description);

        if (taskToEdit != null) {
            Task updatedTask = TaskFactory.createTask(newDescription, newStartTime, newEndTime, newPriority);
            Task conflictingTask = getConflictingTask(updatedTask);

            if (conflictingTask == null || conflictingTask.getDescription().equals(description)) {
                tasks.remove(taskToEdit);
                tasks.add(updatedTask);
                System.out.println("Task updated successfully.");
            } else {
                System.out.println("Error: Task conflicts with existing task \"" + conflictingTask.getDescription() + "\".");
            }
        } else {
            System.out.println("Error: Task not found.");
        }
    }

    // Mark a task as completed
    public void markTaskAsCompleted(String description) {
        Task taskToComplete = findTaskByDescription(description);

        if (taskToComplete != null) {
            taskToComplete.markAsCompleted();
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Error: Task not found.");
        }
    }

    // View tasks by priority level
    public void viewTasksByPriority(String priority) {
        List<Task> filteredTasks = new ArrayList<>();

        for (Task task : tasks) {
            if (task.getPriority().equalsIgnoreCase(priority)) {
                filteredTasks.add(task);
            }
        }

        if (filteredTasks.isEmpty()) {
            System.out.println("No tasks with priority: " + priority);
        } else {
            filteredTasks.sort((t1, t2) -> t1.getStartTime().compareTo(t2.getStartTime()));
            for (Task task : filteredTasks) {
                System.out.println(task);
            }
        }
    }

    // Private helper methods

    // Find a task by description
    private Task findTaskByDescription(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                return task;
            }
        }
        return null;
    }

    // Check if a new task conflicts with existing tasks
    private Task getConflictingTask(Task newTask) {
        for (Task task : tasks) {
            if (task.getEndTime().isAfter(newTask.getStartTime()) && task.getStartTime().isBefore(newTask.getEndTime())) {
                return task;
            }
        }
        return null;
    }
}
