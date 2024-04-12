package integrations.billing;

import debug.DebugLogger;

public class MedicalBillingSystemsIntegration extends MedicalBillingUtility implements MedicalBillingTarget {

    // get patient's billing information
    public void fetchPatientsBillingInfo() {
        // log info
        DebugLogger.printInfo("Getting billing information...");
       
        // get billing information
        fetchBillingInfo();

        // log success message
        DebugLogger.logSuccess("Billing information retrieved successfully.");
    }

    @Override
    public void fetchBillingInfo() {
        // log info
        DebugLogger.printInfo("Getting billing information...");

        // get billing history
        fetchBillingHistory();

        // log success message
        DebugLogger.logSuccess("Billing history retrieved successfully.");
    }


    @Override
    public void getPaymentHistory() {
        // log info
        DebugLogger.printInfo("Getting payment history...");

        // get payment history
        fetchPaymentHistory();

        // log success message
        DebugLogger.logSuccess("Payment history retrieved successfully.");
    }

    @Override
    public void getPaymentSummary() {
        // log info
        DebugLogger.printInfo("Getting payment summary...");

        // get payment summary
        System.out.println("Payment Summary: ");
        System.out.println("Payment Date: 2021-01-01");
        System.out.println("Payment Amount: $100.00");

        // log success message
        DebugLogger.logSuccess("Payment summary retrieved successfully.");
    }
    
}