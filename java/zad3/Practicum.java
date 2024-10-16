package zad3;

import java.util.ArrayList;

public class Practicum {

    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task(TaskPriority.HIGH, "Оплатить интернет."));
        tasks.add(new Task(TaskPriority.LOW, "Сходить в парикмахерскую."));
        tasks.add(new Task(TaskPriority.MEDIUM, "Выбрать подарок подруге на ДР."));
        tasks.add(new Task(TaskPriority.MEDIUM, "Купить билеты в театр."));
        tasks.add(new Task(TaskPriority.HIGH, "Посетить вебинар по английскому языку."));
        tasks.add(new Task(TaskPriority.LOW, "Купить пылесос."));

        System.out.println("Задачи с наивысшим приоритетом на сегодня:");
        for (Task task:tasks){
            if (task.getPriority() == TaskPriority.HIGH){
                System.out.println(task.getDescription());
            }
        }
    }
}

class Task {

    private TaskPriority priority;  // добавьте переменную priority с приоритетом задачи
    private String description;

    public Task(TaskPriority priority, String description){
        this.priority = priority;
        this.description = description;
    }
    public TaskPriority getPriority(){
        return priority;
    }
    public String getDescription() {
        return description;
    }
}
enum TaskPriority {
    HIGH,
    MEDIUM,
    LOW
}