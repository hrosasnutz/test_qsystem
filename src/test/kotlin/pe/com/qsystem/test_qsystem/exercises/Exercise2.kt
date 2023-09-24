package pe.com.qsystem.test_qsystem.exercises

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import pe.com.qsystem.test_qsystem.distribution_center.DistributionCenter
import pe.com.qsystem.test_qsystem.distribution_center.DistributionCenterManager
import pe.com.qsystem.test_qsystem.distribution_center.impl.HuanucoDistributionCenterImpl
import pe.com.qsystem.test_qsystem.distribution_center.impl.IcaDistributionCenterImpl
import pe.com.qsystem.test_qsystem.distribution_center.impl.LurinDistributionCenterImpl
import pe.com.qsystem.test_qsystem.distribution_center.impl.TrujilloDistributionCenterImpl

class Exercise2 {
    
    private lateinit var distributionCenter: DistributionCenter
    
    @BeforeEach
    fun setUp() {
        distributionCenter = DistributionCenterManager(
            setOf(
                HuanucoDistributionCenterImpl(),
                IcaDistributionCenterImpl(),
                LurinDistributionCenterImpl(),
                TrujilloDistributionCenterImpl()
            )
        )
    }

    @Test
    fun `operate in Huanuco`() {
        distributionCenter.operate("HUANUCO");
    }
    
    @Test
    fun `operate in Ica`() {
        distributionCenter.operate("ICA");
    }

    @Test
    fun `operate in Lurin`() {
        distributionCenter.operate("LURIN");
    }

    @Test
    fun `operate in Trujillo`() {
        distributionCenter.operate("TRUJILLO");
    }
}