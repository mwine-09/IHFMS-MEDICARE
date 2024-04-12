package team;

import debug.DebugLogger;
import functionality.SystemDashboard;
import functionality.messaging.GroupMessageObserver;
import user.SystemUser;

// * HealthCare Provider extends user as part of Factory Pattern
// * HealthCareProvider implements Dashboard as part of Decorator Pattern
public class ChiefHealthCareOfficer extends SystemUser implements SystemDashboard, GroupMessageObserver {
    // provides health care services
    public void provideService() {
        System.out.println("Providing health care services");
    }

    @Override
    public void createReport() {
        DebugLogger.printInfo("Generating Chief HealthCare Officer report");
        System.out.println("--- Chief HealthCare Officer Report ---");
        System.out.println("\n Report Contents \n");
        System.out.println("\n 1 \n");
        System.out.println("\n 2 \n");
        System.out.println("\n 3 \n");
        System.out.println("-------------");
        DebugLogger.logSuccess("Chief HealthCare Officer report generated successfully");
    }

    @Override
    public void printReport() {
        // generate report
        createReport();

        // print report
        System.out.println("Chief HealthCare Officer report printed successfully");
    }

    // private message
    private String message;

    // method to get message
    public String getMessage() {
        return message;
    }

    @Override
    public void notifyAnotherMember(GroupMessageObserver member) {
        // send message to another member
        member.sendGroupMessage("Chief HealthCare Officer sent you a message.");
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

        System.out.println("Messaged Received (Accountant): " + getMessage());

        // print message
        System.out.println("HealthCareProvider received message: " + getMessage());
    }



}