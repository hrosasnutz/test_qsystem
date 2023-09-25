package pe.com.test_qsystem.distribution_center.impl;

import pe.com.test_qsystem.distribution_center.DistributionCenter;

public class HuanucoDistributionCenterImpl implements DistributionCenter {

    @Override
    public boolean support(String center) {
        return center.equalsIgnoreCase("HUANUCO");
    }

    @Override
    public void operate(String center) {
        System.out.println("Operate in Huanuco distribution center.");
    }
}
