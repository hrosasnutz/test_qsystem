package pe.com.test_qsystem.storage;

public class FileStorageApp {
    
    private FileStorage storage;
    
    public void saveFile(String path) {
        storage.saveFile(path);
    }

    public void setStorage(FileStorage storage) {
        this.storage = storage;
    }
    
}
