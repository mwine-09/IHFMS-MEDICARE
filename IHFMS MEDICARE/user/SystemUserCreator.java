package user;

import team.SystemAdministrator;
import functionality.messaging.GroupMessageObserver;
import team.ChiefFinanceOfficer;
import team.ChiefHealthCareOfficer;

// It implements the factory method pattern by creating various user from the factory function
public class SystemUserCreator {

    // create user
    public SystemUser createUser(String userType) {
        if (userType == null) {
            return null;
        }
        if (userType.equalsIgnoreCase("ad")) {
            return new SystemAdministrator();
        }else if (userType.equalsIgnoreCase("hc")) {
            return new ChiefHealthCareOfficer();
        } else if (userType.equalsIgnoreCase("fi")) {
            return new ChiefFinanceOfficer();
        } 
        return null;
    }

    // create user as team member
    public GroupMessageObserver createTeamMember(String userType) {
        if (userType == null) {
            return null;
        }
        if (userType.equalsIgnoreCase("ADMIN")) {
            return new SystemAdministrator();
        } else if (userType.equalsIgnoreCase("FINANCE")) {
            return new ChiefFinanceOfficer();
        } else if (userType.equalsIgnoreCase("HEALTHCAREPROVIDER")) {
            return new ChiefHealthCareOfficer();
        }
        return null;
    }

   }
