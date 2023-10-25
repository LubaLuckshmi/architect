package seminar6.dbExamlpe2;

import java.util.List;

// Бизнес-логика для задач
class TaskService {
    private TaskRepository taskRepository;

    TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    Task createTask(String title, String description) {
        Task task = new Task(title, description);
        taskRepository.save(task);
        return task;
    }

    Task updateTask(Task task) {
        taskRepository.update(task);
        return task;
    }

    void deleteTask(long taskId) {
        taskRepository.delete(taskId);
    }

    List<Task> getAllTasks() {
        return taskRepository.getAll();
    }
}

// Хранилище данных для задач
interface TaskRepository {
    void save(Task task);
    void update(Task task);
    void delete(long taskId);
    List<Task> getAll();
}

// Пользовательский интерфейс (веб-приложение)
class WebApp {
    private TaskService taskService;

    WebApp(TaskService taskService) {
        this.taskService = taskService;
    }

    void displayTasks() {
        List<Task> tasks = taskService.getAllTasks();
// Отображение задач в веб-интерфейсе
    }

    void createTask(String title, String description) {
        Task task = taskService.createTask(title, description);
// Отображение созданной задачи в веб-интерфейсе
    }

    void updateTask(Task task) {
        taskService.updateTask(task);
// Отображение обновленной задачи в веб-интерфейсе
    }

    void deleteTask(long taskId) {
        taskService.deleteTask(taskId);
// Удаление задачи из веб-интерфейса
    }
}