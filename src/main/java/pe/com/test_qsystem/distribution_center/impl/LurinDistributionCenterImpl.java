package pe.com.test_qsystem.distribution_center.impl;

import pe.com.test_qsystem.distribution_center.DistributionCenter;

public class LurinDistributionCenterImpl implements DistributionCenter {

    @Override
    public boolean support(String center) {
        return center.equalsIgnoreCase("LURIN");
    }

    @Override
    public void operate(String center) {
        System.out.println("Operate in Lurin distribution center.");
    }
    
}
