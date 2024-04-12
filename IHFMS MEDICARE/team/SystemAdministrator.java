package team;

import debug.DebugLogger;
import functionality.SystemDashboard;
import functionality.messaging.GroupMessageObserver;
import user.SystemUser;

// This file will have all subclasses of User

// * SystemAdministrator extends user as part of Factory Pattern
// * SystemAdministrator implements Dashboard as part of Decorator Pattern
public class SystemAdministrator extends SystemUser implements SystemDashboard, GroupMessageObserver {

    @Override
    public void printMyDetails() {
        System.out.println("SystemAdministrator: I am an" +  super.getRole() + "admin.");
    }

    @Override
    public void createReport() {
        DebugLogger.printInfo("System Admin Report");
        System.out.println("---System Admin Report ---");
        System.out.println("\n Contents \n");
        System.out.println("\n 1 \n");
        System.out.println("\n 2 \n");
        System.out.println("\n 3 \n");
        DebugLogger.logSuccess("System Admin report generated successfully");
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

        System.out.println("Messaged Received (SystemAdministrator): " + getMessage());
    }

    @Override
    public void notifyAnotherMember(GroupMessageObserver member) {
        // send message to another member
        member.sendGroupMessage("Admin sent you a message.");
    }

    @Override
    public void printReport() {
        // call genreate report
        createReport();

        // connect printer
        System.out.println("Admin connected to printer");

        // print report
        System.out.println("Admin printed report");

        // log
        DebugLogger.printInfo("Printed Admin report");
    }

}
