package pe.com.qsystem.test_qsystem.distribution_center

interface DistributionCenter {
    
    fun support(center: String): Boolean
    
    fun operate(center: String)
}