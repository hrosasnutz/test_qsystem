package pe.com.test_qsystem.exercises;

import org.junit.jupiter.api.Test;
import pe.com.test_qsystem.storage.FileStorageApp;
import pe.com.test_qsystem.storage.impl.DatabaseFileStorage;
import pe.com.test_qsystem.storage.impl.FtpFileStorage;
import pe.com.test_qsystem.storage.impl.LocalFileStorage;
import pe.com.test_qsystem.storage.impl.S3FileStorage;

public class Exercise3 {
    
    private FileStorageApp app = new FileStorageApp();
    
    @Test
    public void saveFileOnMultipleTargets() {
        app.setStorage(new DatabaseFileStorage());
        app.saveFile("/home/user");

        app.setStorage(new FtpFileStorage());
        app.saveFile("/home/user");

        app.setStorage(new LocalFileStorage());
        app.saveFile("/home/user");

        app.setStorage(new S3FileStorage());
        app.saveFile("/home/user");
    }
}
