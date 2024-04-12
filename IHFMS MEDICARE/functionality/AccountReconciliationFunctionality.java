package functionality;

// Functionality:
// 3.Accounts Reconciliation: Automated reconciliation of accounts receivable, accounts payable, and general ledger entries to ensure financial transparency and compliance.
public interface AccountReconciliationFunctionality {
    // receive payments to cater for the accounts receivable
    public void receivePayments();

    // make payments to cater for the accounts payable
    public void processPayments();

    // reconcile accounts for automatic accounts reconciliation
    public void performAccountReconciliation();

}