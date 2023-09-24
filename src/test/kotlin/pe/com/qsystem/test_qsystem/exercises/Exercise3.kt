package pe.com.qsystem.test_qsystem.exercises

import org.junit.jupiter.api.Test
import pe.com.qsystem.test_qsystem.storage.FileStorageApp
import pe.com.qsystem.test_qsystem.storage.impl.DatabaseFileStorage
import pe.com.qsystem.test_qsystem.storage.impl.FtpFileStorage
import pe.com.qsystem.test_qsystem.storage.impl.LocalFileStorage
import pe.com.qsystem.test_qsystem.storage.impl.S3FileStorage

class Exercise3 {
    
    @Test
    fun `save file on multiple targets`() {
        val app = FileStorageApp()
        app.fileStorage = DatabaseFileStorage()
        app.saveFile("/home/user")

        app.fileStorage = FtpFileStorage()
        app.saveFile("/home/user")

        app.fileStorage = LocalFileStorage()
        app.saveFile("/home/user")

        app.fileStorage = S3FileStorage()
        app.saveFile("/home/user")
    }
}