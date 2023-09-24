package pe.com.qsystem.test_qsystem.distribution_center

import java.lang.RuntimeException

class DistributionCenterManager(
    private val centers: Set<DistributionCenter>
) : DistributionCenter {

    override fun support(center: String) = true

    override fun operate(center: String) {
        centers.find { it.support(center) }
            ?.operate(center) ?: throw RuntimeException("Not found $center distribution center implementation.")
    }
}