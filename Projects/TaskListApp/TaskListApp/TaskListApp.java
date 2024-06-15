import java.util.ArrayList;
import java.util.Scanner;

class TaskList {

    private ArrayList<String> tasks = new ArrayList<>();

    public void addTask(Scanner sc) {
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Enter task name: ");
        tasks.add(sc.nextLine());
        System.out.println();
        System.out.println("Task Added");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }

    public void removeTask(Scanner sc) {
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();

        if (tasks.size() == 0) {
            System.out.println("No tasks to remove.");
        } else {
            listTasks();
            System.out.println("Enter the task number you want to remove: ");
            int taskNumber = Integer.parseInt(sc.nextLine());
            if (isValidTaskNumber(taskNumber)) {
                tasks.remove(taskNumber - 1);
                System.out.println("Task removed.");
            } else {
                System.out.println("Invalid task number.");
            }
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }

    public void listTasks() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();

        if (!tasks.isEmpty()) {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        } else {
            System.out.println("No tasks to display");
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }

    public Boolean isEmpty() {
        return tasks.isEmpty();
    }

    public Boolean isValidTaskNumber(int taskNumber) {
        return taskNumber >= 1 && taskNumber <= tasks.size();
    }
}

public class TaskListApp {

    public static void displayMenu() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("Task List Application");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. List Tasks");
        System.out.println("4. Quit");
        System.out.println("Select an Option: ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    taskList.addTask(sc);
                    break;
                case 2:
                    taskList.removeTask(sc);
                    break;
                case 3:
                    taskList.listTasks();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
