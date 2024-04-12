package team;

import debug.DebugLogger;
import functionality.SystemDashboard;
import functionality.messaging.MessageProcessor;
import user.SystemUser;

// This file will have all subclasses of User

// * SystemAdministrator extends user as part of Factory Pattern
// * SystemAdministrator implements Dashboard as part of Decorator Pattern
public class SystemAdministrator extends SystemUser implements SystemDashboard  {
    public MessageProcessor messageProcessor = MessageProcessor.getMessageProcessor();
    DebugLogger logger = DebugLogger.getLogger();

    @Override
    public void createReport() {
        logger.printInfo("Generating System Admin Report");
        System.out.println("-----------------------------------------------------");
        System.out.println("|                  System Admin Report               |");
        System.out.println("-----------------------------------------------------");
        System.out.println("|                                                   |");
        System.out.println("| Report Contents:                                  |");
        System.out.println("| 1. User Management                                |");
        System.out.println("| 2. Security Analysis                              |");
        System.out.println("| 3. System Performance Overview                    |");
        System.out.println("|                                                   |");
        System.out.println("-----------------------------------------------------");
        logger.logSuccess("System Admin report generated successfully");
    }
    
    @Override
    public void printMyDetails() {
        System.out.println("SystemAdministrator: I am an" +  super.getRole() + "admin.");
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
        logger.printInfo("Printed Admin report");
    }

}
