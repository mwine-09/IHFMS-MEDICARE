package adaptations.billing;

// An adapter for legacy (other) billing systems
public interface MedicalBillingTarget {

    // Retrieve patient's billing information
    public void retrieveBillingInformation();

    // Retrieve patient's billing history
    public void retrieveBillingHistory();

    // Retrieve patient's payment history
    public void retrievePaymentHistory();

    // Retrieve patient's payment summary
    public void retrievePaymentSummary();
}
