package pe.com.qsystem.test_qsystem.storage

class FileStorageApp {
    
    lateinit var fileStorage: FileStorage
    
    fun saveFile(path: String) {
        fileStorage.saveFile(path)
    }
}