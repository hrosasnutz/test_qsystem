package pe.com.test_qsystem.distribution_center.impl;

import pe.com.test_qsystem.distribution_center.DistributionCenter;

public class IcaDistributionCenterImpl implements DistributionCenter {

    @Override
    public boolean support(String center) {
        return center.equalsIgnoreCase("ICA");
    }

    @Override
    public void operate(String center) {
        System.out.println("Operate in Ica distribution center.");
    }
}
