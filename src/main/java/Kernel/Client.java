package Kernel;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public String name;
    public List<BackupTask> taskList;

    public Client(String clientName, List<BackupTask> backupTaskList) {
        name = clientName;
        taskList = backupTaskList;
    }

    public Client(String clientName) {
        this(clientName, new ArrayList<>());
    }

    public Client() {
        this("New Client");
    }

}
