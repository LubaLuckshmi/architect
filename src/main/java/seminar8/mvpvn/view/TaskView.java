package seminar8.mvpvn.view;

import seminar8.mvpvn.viewModel.TaskViewModel;

import java.util.List;

public interface TaskView {
    void showTasks(List<TaskViewModel> taskViewModels);
}