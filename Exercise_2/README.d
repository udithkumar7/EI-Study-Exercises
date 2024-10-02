Astronaut Daily Schedule Organizer
Overview
The Astronaut Daily Schedule Organizer is a console-based application designed to help astronauts manage their daily tasks efficiently. Users can add, remove, edit, and view tasks, as well as mark them as completed. This application is built using Java and demonstrates the implementation of various design patterns, including Singleton, Factory, and Observer patterns.

Features
Add Tasks: Create new tasks with a description, start time, end time, and priority level.
Remove Tasks: Delete existing tasks from the schedule.
View Tasks: Display all tasks sorted by start time.
Edit Tasks: Modify the details of an existing task.
Mark as Completed: Mark tasks as completed.
View by Priority: Filter and view tasks based on priority levels (High, Medium, Low).
Conflict Detection: Automatically detect and prevent overlapping tasks.
Class Operations
1. Main
Operation: Launches the application and provides a command-line interface for user interaction.
Functions:
Displays the menu for user commands.
Reads user input and calls corresponding methods in ScheduleManager.
2. ScheduleManager
Operation: Manages all tasks, ensuring single-instance usage through the Singleton pattern.
Functions:
addTask(Task task): Adds a new task after validating time and conflicts.
removeTask(String description): Removes a task based on its description.
viewTasks(): Displays all tasks sorted by start time.
editTask(String oldDescription, String newDescription, String newStartTime, String newEndTime, String newPriority): Edits an existing task.
markTaskAsCompleted(String description): Marks a task as completed.
viewTasksByPriority(String priority): Views tasks filtered by priority.
findTaskByDescription(String description): Helper method to find a task by its description.
3. Task
Operation: Represents a task with details such as description, start time, end time, priority, and completion status.
Functions:
Constructor: Initializes a new task with description, start time, end time, and priority.
markAsCompleted(): Sets the task's completion status to true.
toString(): Returns a string representation of the task, including its completion status.
4. TaskFactory
Operation: Creates task objects using the Factory pattern.
Functions:
createTask(String description, String startTime, String endTime, String priority): Returns a new instance of a Task object.
5. TimeValidator
Operation: Validates and parses time input.
Functions:
isValidTime(String time): Checks if the time format is valid.
parseTime(String time): Parses and converts a valid time string into a LocalTime object.
6. ConflictNotifier
Operation: Notifies users of task conflicts using the Observer pattern.
Functions:
notifyConflict(Task newTask, Task existingTask): Alerts the user about conflicts with existing tasks.
Requirements
Java Development Kit (JDK) 8 or higher
An IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor to run the code
Design Patterns Used
Singleton Pattern: Ensures a single instance of the ScheduleManager class.
Factory Pattern: Utilizes a factory to create task objects.
Observer Pattern: Notifies users of task conflicts or updates.
Error Handling
The application gracefully handles errors such as invalid time formats, task conflicts, and non-existent tasks, providing appropriate messages to the user.
