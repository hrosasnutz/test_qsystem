package pe.com.qsystem.test_qsystem.storage.impl

import org.slf4j.LoggerFactory
import pe.com.qsystem.test_qsystem.storage.FileStorage

class S3FileStorage : FileStorage {
    
    private val log = LoggerFactory.getLogger(javaClass)
    
    override fun saveFile(path: String) {
        log.info("Save file on aws s3.")
    }
}