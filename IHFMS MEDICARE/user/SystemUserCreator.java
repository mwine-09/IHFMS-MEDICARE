package user;
import debug.DebugLogger;
import team.ChiefFinanceOfficer;
import team.SystemAdministrator;

// Factory class for creating different types of system users
public class SystemUserCreator {
    DebugLogger logger = DebugLogger.getLogger();

    private static SystemUserCreator systemUserSingleton = null;

    public static SystemUserCreator getSystemUserCreator() {
        if (systemUserSingleton == null) {
            return new SystemUserCreator();
        }
        else {
            return systemUserSingleton;
        }
    }


    // Create a team member based on user type
  
    // Create a user based on user type
    public SystemUser createUser(String userType) {


        SystemUser user;

        switch (userType.toUpperCase()) {
        case "AD":
        logger.logSuccess("You have created a system admin");
        //      SystemUser systemAdmin = new SystemAdministrator();
        // systemAdmin.setRole(userType.toUpperCase());
        user = new SystemAdministrator();
        user.setRole(userType.toUpperCase());
        return user;
    case "HC":
    logger.logSuccess("You have created a chief health care officer  ");
    // SystemUser chiefHealth = new ChiefHealthCareOfficer();
        
    //     chiefHealth.setRole(userType.toUpperCase());

    user = new ChiefFinanceOfficer();
    user.setRole(userType.toUpperCase());
        return user;
    case "FI":
        logger.logSuccess("You have created a chief finance officer  ");

        // SystemUser chiefFinance = new ChiefFinanceOfficer();
        // chiefFinance.setRole(userType.toUpperCase());
        user = new ChiefFinanceOfficer();
        user.setRole(userType.toUpperCase());
            return user;
        default:
            return null;
        }

    }
 
}
