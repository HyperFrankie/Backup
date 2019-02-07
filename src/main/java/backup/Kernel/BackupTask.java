package backup.Kernel;

public class BackupTask {

    public static final int UNKNOWN = -1, MINDTIME = 0, COBIAN_BACKUP_10 = 1, COBIAN_BACKUP_11 = 2, ROBOCOPY = 3;

    public int program;
    public String name;
    public Source source;
    public Destination destination;

    public BackupTask(String backupTaskName, backup.Kernel.Source backupSource, backup.Kernel.Destination backupDestination, int BACKUP_PROGRAM) {
        name = backupTaskName;
        source = backupSource;
        destination = backupDestination;
        program = BACKUP_PROGRAM;
    }

    public BackupTask(String backupTaskName, backup.Kernel.Source backupSource, backup.Kernel.Destination backupDestination) {
        this(backupTaskName, backupSource, backupDestination, UNKNOWN);
    }

    public BackupTask(String backupTaskName) {
        this(backupTaskName, null, null);
    }

    public BackupTask() {
        this("New task");
    }

    public int getBackupProgram() {
        return program;
    }
    public void setBackupProgram(int BACKUP_PROGRAM) {
        program = BACKUP_PROGRAM;
    }

    public String getName() {
        return name;
    }
    public void setName(String clientName) {
        name = clientName;
    }

    public backup.Kernel.Destination getBackupDestination() {
        return destination;
    }
    public void setBackupDestination(backup.Kernel.Destination backupDestination) {
        destination = backupDestination;
    }

    public backup.Kernel.Source getBackupSource() {
        return source;
    }
    public void setBackupSource(backup.Kernel.Source backupSource) {
        source = backupSource;
    }

}
