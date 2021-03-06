package interfaces.simpletasks;

import java.util.ArrayList;
import java.util.List;

public class SimpleTasks implements Runnable {

    private List<String> tasks = new ArrayList<>();

    public List<String> getTasks() {
        return tasks;
    }

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    private boolean nextStep() {
        if (tasks.size() != 0) {
            tasks.remove(tasks.size() - 1);
            return true;
        }
        return false;
    }

    @Override
    public void run() {
        while (nextStep()) {
            nextStep();
        }
    }
}
