package pe.com.test_qsystem.distribution_center.impl;

import pe.com.test_qsystem.distribution_center.DistributionCenter;

public class TrujilloDistributionCenterImpl implements DistributionCenter {

    @Override
    public boolean support(String center) {
        return center.equalsIgnoreCase("TRUJILLO");
    }

    @Override
    public void operate(String center) {
        System.out.println("Operate in Trujillo distribution center.");
    }
    
}
