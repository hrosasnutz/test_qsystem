package pe.com.test_qsystem.storage.impl;

import pe.com.test_qsystem.storage.FileStorage;

public class LocalFileStorage implements FileStorage {

    @Override
    public void saveFile(String path) {
        System.out.println("save file on local disk.");
    }
}
