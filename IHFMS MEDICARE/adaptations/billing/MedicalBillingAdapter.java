package adaptations.billing;

import debug.DebugLogger;

public class MedicalBillingAdapter extends MedicalBillingAdaptee implements MedicalBillingTarget {
    DebugLogger logger = DebugLogger.getLogger();
    @Override
    public void retrieveBillingInformation() {
        // Log info
        logger.printInfo("Retrieving billing information...");
       
        // Call adaptee method
        fetchBillingInfo();

        // Log success message
        logger.logSuccess("Billing information retrieved successfully.");
    }

    @Override
    public void retrieveBillingHistory() {
        // Log info
        logger.printInfo("Retrieving billing history...");

        // Call adaptee method
        fetchBillingHistory();

        // Log success message
        logger.logSuccess("Billing history retrieved successfully.");
    }

    @Override
    public void retrievePaymentHistory() {
        // Log info
        logger.printInfo("Retrieving payment history...");

        // Call adaptee method
        fetchPaymentHistory();

        // Log success message
        logger.logSuccess("Payment history retrieved successfully.");
    }

    @Override
    public void retrievePaymentSummary() {
        // Log info
        logger.printInfo("Retrieving payment summary...");

        // Print payment summary
        System.out.println("Payment Summary: ");
        System.out.println("Payment Date: 2021-01-01");
        System.out.println("Payment Amount: $100.00");

        // Log success message
        logger.logSuccess("Payment summary retrieved successfully.");
    }
}
