package Kernel;

import java.util.ArrayList;
import java.util.List;

public class Source {

    public String name;
    public List<BackupTask> taskList;

    public Source(String clientName, List<BackupTask> backupTaskList) {
        name = clientName;
        taskList = backupTaskList;
    }

    public Source(String clientName) {
        this(clientName, new ArrayList<>());
    }

    public Source() {
        this("New Client");
    }

}
