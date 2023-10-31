package seminar8.mvpvn.mainInteraction;

import seminar8.mvpvn.view.ConsoleView;
import seminar8.mvpvn.presenter.TaskPresenter;
import seminar8.mvpvn.view.TaskView;

import java.util.Scanner;

public class MVPVMPatternDemo {
    public static void main(String[] args) {
        TaskView view = new ConsoleView();
        TaskPresenter presenter = new TaskPresenter(view);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            presenter.displayTasks();
            System.out.println("Введите номер задачи, чтобы отметить ее как завершенную (или 'exit' для выхода): ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                break;
            }

            try {
                int taskId = Integer.parseInt(input) - 1;
                presenter.completeTask(taskId);
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите номер задачи.");
            }
        }
    }
}