package pe.com.test_qsystem.distribution_center;

import java.util.Set;

public class DistributionCenterManager {
    
    private final Set<DistributionCenter> centers;
    
    public DistributionCenterManager(Set<DistributionCenter> centers) {
        this.centers = centers;
    }
    
    public void operate(String center) {
        centers.stream()
                .filter(c -> c.support(center))
                .findFirst()
                .ifPresentOrElse(
                        c -> c.operate(center), 
                        () -> System.out.println("Not found implementation for " + center + " center.")
                );
    }
    
}
