package seminar8.mvi;

import seminar8.mvi.model.TaskCompletedIntent;
import seminar8.mvi.presenter.TasksPresenter;
import seminar8.mvi.view.BaseView;
import seminar8.mvi.view.ConsoleView;

import java.util.Scanner;

public class MVIPatternDemo {
    public static void main(String[] args) {
        BaseView view = new ConsoleView();
        TasksPresenter presenter = new TasksPresenter(view);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            presenter.loadTasks();
            System.out.println("Введите номер задачи, чтобы отметить ее как завершенную (или 'exit' для выхода): ");
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                break;
            }

            try {
                int taskId = Integer.parseInt(input) - 1;
                presenter.dispatch(new TaskCompletedIntent(taskId));
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите номер задачи.");
            }
        }
    }
}
