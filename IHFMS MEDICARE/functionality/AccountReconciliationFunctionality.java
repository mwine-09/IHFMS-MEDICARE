package functionality;

// Interface for automated reconciliation of accounts receivable, accounts payable, and general ledger entries
public interface AccountReconciliationFunctionality {
    // Receive payments to account for accounts receivable
    public void receivePayments();

    // Process payments to account for accounts payable
    public void processPayments();

    // Perform account reconciliation for automatic reconciliation
    public void performAccountReconciliation();
}
