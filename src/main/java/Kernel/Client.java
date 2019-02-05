package Kernel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

    private String name;
    private List<BackupTask> taskList;

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

    public List<BackupTask> getBackupTaskList() {
        return taskList;
    }
    public void setBackupTaskList(List<BackupTask> backupTaskList) {
        taskList = backupTaskList;
    }
    public void addBackupTask(BackupTask... backupTask) {
        taskList.addAll(Arrays.asList(backupTask));
    }
    public void removeBackuptask(BackupTask... backupTask) {
        taskList.removeAll(Arrays.asList(backupTask));
    }
    public void emptyBackupTaskList() {
        taskList.clear();
    }

    public String getName() {
        return name;
    }
    public void setName(String clientName) {
        name = clientName;
    }

}
