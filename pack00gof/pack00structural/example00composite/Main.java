package pack00structural.example00composite;

// Client
public class Main {
  public static void main(String[] args) {
    // Creating simple tasks
    Task simpleTask1 = new SimpleTask("Complete Coding");
    Task simpleTask2 = new SimpleTask("Write Documentation");

    // Creating a task list
    TaskList projectTasks = new TaskList("Project Tasks");
    projectTasks.addTask(simpleTask1);
    projectTasks.addTask(simpleTask2);

    // Nested task list
    TaskList phase1Tasks = new TaskList("Phase 1 Tasks");
    phase1Tasks.addTask(new SimpleTask("Design"));
    phase1Tasks.addTask(new SimpleTask("Implementation"));

    projectTasks.addTask(phase1Tasks);

    // Displaying tasks
    projectTasks.display();
  }
}


/*
Output

Task List: Project Tasks
  Simple Task: Complete Coding
  Simple Task: Write Documentation
  Task List: Phase 1 Tasks
    Simple Task: Design
    Simple Task: Implementation
*/
