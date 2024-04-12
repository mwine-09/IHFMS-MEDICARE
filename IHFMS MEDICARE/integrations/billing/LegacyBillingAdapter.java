package integrations.billing;

// an adapter for legacy (other) billing systems
public interface MedicalBillingTarget
 {

    // get patient's billing information
    public void fetchBillingInfo();

    // get patient's billing history
    public void fetchBillingHistory();

    // get patient's payment history
    public void getPaymentHistory();

    // get patient's payment summary
    public void getPaymentSummary();
}
