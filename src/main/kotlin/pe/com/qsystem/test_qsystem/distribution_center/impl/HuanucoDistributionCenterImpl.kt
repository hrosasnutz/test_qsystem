package pe.com.qsystem.test_qsystem.distribution_center.impl

import org.slf4j.LoggerFactory
import pe.com.qsystem.test_qsystem.distribution_center.DistributionCenter

class HuanucoDistributionCenterImpl : DistributionCenter {
        
    private val log = LoggerFactory.getLogger(javaClass)

    override fun support(center: String) = center.contentEquals("HUANUCO", true)

    override fun operate(center: String) {
        log.info("Operate in Huanuco distribution center.")
    }
}