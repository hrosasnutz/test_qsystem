package pe.com.test_qsystem.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.util.collections.Sets;
import pe.com.test_qsystem.distribution_center.DistributionCenterManager;
import pe.com.test_qsystem.distribution_center.impl.HuanucoDistributionCenterImpl;
import pe.com.test_qsystem.distribution_center.impl.IcaDistributionCenterImpl;
import pe.com.test_qsystem.distribution_center.impl.LurinDistributionCenterImpl;
import pe.com.test_qsystem.distribution_center.impl.TrujilloDistributionCenterImpl;

public class Exercise2 {
    
    private DistributionCenterManager manager;
    
    @BeforeEach
    public void setUp() {
        manager = new DistributionCenterManager(
                Sets.newSet(
                        new HuanucoDistributionCenterImpl(),
                        new IcaDistributionCenterImpl(),
                        new LurinDistributionCenterImpl(),
                        new TrujilloDistributionCenterImpl()
                )
        );
    }
    
    @Test
    public void operateInHuanuco() {
        manager.operate("HUANUCO");
    }

    @Test
    public void operateInIca() {
        manager.operate("ICA");
    }

    @Test
    public void operateInLurin() {
        manager.operate("LURIN");
    }
    
    @Test
    public void operateInTrujillo() {
        manager.operate("TRUJILLO");
    }
    
}
