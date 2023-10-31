package seminar8.mvpvn.viewModel;

import seminar8.mvpvn.model.Task;

public class TaskViewModel {
    private String displayName;

    public TaskViewModel(Task task) {
        this.displayName = task.getName() + (task.isCompleted() ? " (completed)" : "");
    }

    public String getDisplayName() {
        return displayName;
    }
}