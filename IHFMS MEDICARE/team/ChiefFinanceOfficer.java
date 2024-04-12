package team;

import functionality.AccountReconciliationFunctionality;
import functionality.FinanceAutomationFunctionality;
import functionality.messaging.GroupMessageObserver;
import user.SystemUser;

// * ChiefFinanceOfficer extends user as part of Factory Pattern
public class ChiefFinanceOfficer extends SystemUser
        implements FinanceAutomationFunctionality, AccountReconciliationFunctionality, GroupMessageObserver {


    @Override
    public void printMyDetails() {
        System.out.println("Chief Finance Officer: I am a" + super.getName() + "Chief Finance Officer.");
    }

    @Override
    public void runFinancialAutomation() {
        // Automate financial transactions ....
        System.out.println("Automating financial transactions");
    }

    @Override
    public void automateInvoicing() {
        // Automate invoicing ....
        System.out.println("Automating invoicing");
    }

    @Override
    public void executeAutomatedBilling() {
        // Automate billing ....
        System.out.println("Automating billing");
    }

    @Override
    public void executePaymentAutomation() {
        // Automate payment processing ....
        System.out.println("Automating payment processing");
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
        System.out.println("Chief Finance Officer received message: " + getMessage());
    }

    @Override
    public void receivePayments() {
        // print
        System.out.println("Chief Finance Officer received payments");
    }

    @Override
    public void processPayments() {
        // print
        System.out.println("Chief Finance Officer made payments");
    }

    @Override
    public void performAccountReconciliation() {
        // print
        System.out.println("Chief Finance Officer reconciled accounts");
    }

    @Override
    public void notifyAnotherMember(GroupMessageObserver member) {
        // send message to another member
        member.sendGroupMessage("Chief Finance Officer sent you a message.");
    }

}