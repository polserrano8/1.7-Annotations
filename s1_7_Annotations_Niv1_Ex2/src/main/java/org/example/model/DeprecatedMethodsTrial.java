package org.example.model;

public class DeprecatedMethodsTrial {
    public DeprecatedMethodsTrial(){};
    @SuppressWarnings("deprecation")
    public void deprecatedMethodUse(PresentialWorker worker){
        worker.wageCalculationExtraShow();
    }
}
