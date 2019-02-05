package Kernel;

public class BackupTask {

    public static final int UNKNOWN = -1, MINDTIME = 0, COBIAN_BACKUP_10 = 1, COBIAN_BACKUP_11 = 2, ROBOCOPY = 3;

    private int program;
    private String name;
    private Source source;
    private Destination destination;

    public BackupTask(String backupTaskName, Source backupSource, Destination backupDestination, int BACKUP_PROGRAM) {
        name = backupTaskName;
        source = backupSource;
        destination = backupDestination;
        program = BACKUP_PROGRAM;
    }

    public BackupTask(String backupTaskName, Source backupSource, Destination backupDestination) {
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

    public Destination getBackupDestination() {
        return destination;
    }
    public void setBackupDestination(Destination backupDestination) {
        destination = backupDestination;
    }

    public Source getBackupSource() {
        return source;
    }
    public void setBackupSource(Source backupSource) {
        source = backupSource;
    }

}
