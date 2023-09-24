package pe.com.qsystem.test_qsystem.distribution_center.impl

import org.slf4j.LoggerFactory
import pe.com.qsystem.test_qsystem.distribution_center.DistributionCenter

class LurinDistributionCenterImpl : DistributionCenter {
        
    private val log = LoggerFactory.getLogger(javaClass)

    override fun support(center: String) = center.contentEquals("LURIN", true)

    override fun operate(center: String) {
        log.info("Operate in Lurin distribution center.")
    }
}