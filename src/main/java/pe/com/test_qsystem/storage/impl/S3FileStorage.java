package pe.com.test_qsystem.storage.impl;

import pe.com.test_qsystem.storage.FileStorage;

public class S3FileStorage implements FileStorage {

    @Override
    public void saveFile(String path) {
        System.out.println("save file on aws s3.");
    }
    
}
