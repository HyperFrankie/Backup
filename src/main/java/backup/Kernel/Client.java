package backup.Kernel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

    public String name;
    public List<backup.Kernel.BackupTask> taskList;

    public Client(String clientName, List<backup.Kernel.BackupTask> backupTaskList) {
        name = clientName;
        taskList = backupTaskList;
    }

    public Client(String clientName) {
        this(clientName, new ArrayList<>());
    }

    public Client() {
        this("New Client");
    }

    public List<backup.Kernel.BackupTask> getBackupTaskList() {
        return taskList;
    }
    public void setBackupTaskList(List<backup.Kernel.BackupTask> backupTaskList) {
        taskList = backupTaskList;
    }
    public void addBackupTask(backup.Kernel.BackupTask... backupTask) {
        taskList.addAll(Arrays.asList(backupTask));
    }
    public void removeBackuptask(backup.Kernel.BackupTask... backupTask) {
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
