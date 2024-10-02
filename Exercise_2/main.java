package Daily_Schedule;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("\nChoose an action: add, remove, view, edit, complete, view_priority, exit");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();
                    System.out.println("Enter start time (HH:mm):");
                    String startTime = scanner.nextLine();
                    System.out.println("Enter end time (HH:mm):");
                    String endTime = scanner.nextLine();
                    System.out.println("Enter priority (High, Medium, Low):");
                    String priority = scanner.nextLine();

                    try {
                        Task task = TaskFactory.createTask(description, startTime, endTime, priority);
                        manager.addTask(task);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "remove":
                    System.out.println("Enter task description to remove:");
                    String removeDescription = scanner.nextLine();
                    manager.removeTask(removeDescription);
                    break;

                case "view":
                    manager.viewTasks();
                    break;

                case "edit":
                    System.out.println("Enter task description to edit:");
                    String oldDescription = scanner.nextLine();
                    System.out.println("Enter new task description:");
                    String newDescription = scanner.nextLine();
                    System.out.println("Enter new start time (HH:mm):");
                    String newStartTime = scanner.nextLine();
                    System.out.println("Enter new end time (HH:mm):");
                    String newEndTime = scanner.nextLine();
                    System.out.println("Enter new priority (High, Medium, Low):");
                    String newPriority = scanner.nextLine();

                    try {
                        manager.editTask(oldDescription, newDescription, newStartTime, newEndTime, newPriority);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "complete":
                    System.out.println("Enter task description to mark as completed:");
                    String completeDescription = scanner.nextLine();
                    manager.markTaskAsCompleted(completeDescription);
                    break;

                case "view_priority":
                    System.out.println("Enter priority level (High, Medium, Low):");
                    String viewPriority = scanner.nextLine();
                    manager.viewTasksByPriority(viewPriority);
                    break;

                case "exit":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid command. Please try again.");
                    break;
            }
        } while (!command.equalsIgnoreCase("exit"));

        scanner.close();
    }
}

