import debug.DebugLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import team.SystemAdministrator;
import user.SystemUser;
import user.SystemUserCreator;


class DriverClass {
    public static void main (String [] args){
List<SystemUser> messageObservers = new ArrayList<>();
SystemUserCreator userCreator = SystemUserCreator.getSystemUserCreator();
DebugLogger logger = DebugLogger.getLogger();

int userNumber;

Scanner scanner = new Scanner(System.in);
 logger.printInfo("-------- IHFMS MEDICARE--------");

        System.out.println("Thanks for choosing IHFMS");
        System.out.println();
        System.out.println("As a system admin, enter how mnay users you want to create");
        userNumber = scanner.nextInt();
        if (userNumber > 0 && userNumber < 4) {
             for (var i = 0; i < userNumber; i++) {
SystemUser user=null;


                  while (user == null) {
                       System.out.println(
                                 "Enter the type of user you want to create (AD for admin, HC for Healthcare provider, FI for Chief Finance Officer):");
                       String userType = scanner.next();
                       user = userCreator.createUser(userType);
                  }
                  System.out.println("Enter username please........");

                  String username = scanner.next();
                  user.setName(username);
                  messageObservers.add(user);
             }

        }

        for (SystemUser systemUser : messageObservers) {

            String messageObserver = systemUser.toString();
            logger.logSuccess(messageObserver + " and has been added to the list");

        }


        logger.printInfo("-- (Message Observer) Observer Pattern --");
        SystemAdministrator systemAdministrator = null;
        for (SystemUser systemUser : messageObservers) {
            String role = systemUser.getRole();
            if (role == "AD") {
                systemAdministrator = (SystemAdministrator) systemUser;
                break;
            }

        }
        if (systemAdministrator == null) {
            systemAdministrator = (SystemAdministrator) userCreator.createUser("ad");
        }

        systemAdministrator.messageProcessor
                .setMessage("This is the message to all my guys");
        systemAdministrator.messageProcessor
                .sendGroupMessage("I hae sent the message to the group");



        











scanner.close();

    }


}