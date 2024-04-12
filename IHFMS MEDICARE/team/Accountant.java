package team;

import functionality.AccountReconciliationFunctionality;
import functionality.messaging.GroupMessageObserver;
import user.SystemUser;

public class Accountant extends SystemUser implements AccountReconciliationFunctionality, GroupMessageObserver {

    public void createLedgerEntries() {
        System.out.println("Generating ledger entries");
    }

    // receive payments to cater for the accounts receivable
    public void receivePayments() {
        System.out.println("Receiving payments");
    }

    @Override
    public void notifyAnotherMember(GroupMessageObserver member) {
        // send message to another member
        member.sendGroupMessage("Accountant sent you a message.");
    }

    // reconcile accounts for automatic accounts reconciliation
    public void performAccountReconciliation() {
        System.out.println("Reconciling accounts");
    }

    // private message
    private String message;

    // method to get message
    public String getMessage() {
        return message;
    }

    // method to set message
    public void setMessage(String message) {
        this.message = message;
    }

    // method to update team message
    @Override
    public void sendGroupMessage(String message) {
        // set message
        setMessage(message);

        // print message
        System.out.println("Messaged Received (Accountant): " + getMessage());
    }

    // make payments to cater for the accounts payable
    public void processPayments() {
        System.out.println("Making payments");
    }

}