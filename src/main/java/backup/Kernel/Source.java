package backup.Kernel;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Source {

    public String device;
    public List<URI> files, exceptions;

    public Source(String sourceDeviceName, List<URI> sourceFiles, List<URI> exceptionFiles) {
        device = sourceDeviceName;
        files = sourceFiles;
        exceptions = exceptionFiles;
    }

    public Source(String sourceDeviceName) {
        this(sourceDeviceName, new ArrayList<>(), new ArrayList<>());
    }

    public Source() {
        this("Device");
    }

    public String getSourceDeviceName() {
        return device;
    }
    public void setSourceDeviceName(String sourceDeviceName) {
        device = sourceDeviceName;
    }

    public List<URI> getSourceFileList() {
        return files;
    }
    public void setSourceFileList(List<URI> sourceFileList) {
        files = sourceFileList;
    }
    public void addSourceFile(URI... sourceFile) {
        files.addAll(Arrays.asList(sourceFile));
    }
    public void removeSourceFile(URI... sourceFile) {
        files.removeAll(Arrays.asList(sourceFile));
    }
    public void emptySourceFileList() {
        files.clear();
    }

    public List<URI> getExceptionFileList() {
        return exceptions;
    }
    public void setExceptionFileList(List<URI> exceptionFileList) {
        exceptions = exceptionFileList;
    }
    public void addExceptionFile(URI... exceptionFile) {
        exceptions.addAll(Arrays.asList(exceptionFile));
    }
    public void removeExceptionFile(URI... exceptionFile) {
        exceptions.removeAll(Arrays.asList(exceptionFile));
    }
    public void emptyExceptionFileList() {
        exceptions.clear();
    }
}
