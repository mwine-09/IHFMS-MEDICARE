import debug.DebugLogger;
import functionality.messaging.GroupMessageObserver;
import functionality.messaging.MessagingFunctionality;
import integrations.billing.MedicalBillingSystemsIntegration;
import integrations.ehr.PatientHealthInfoIntegration;
import user.*;

public class PatternsConsoleApp {

    public static void main(String[] args) {

        // print start factory
        DebugLogger.printInfo("-- Factory Pattern --");

        // * Factory Pattern
        SystemUserCreator userFactory = new SystemUserCreator();

        // use factory pattern to create users
        SystemUser financeOfficer = userFactory.createUser("fi");
        SystemUser admininistrator = userFactory.createUser("ad");
        SystemUser healthCareOfficer = userFactory.createUser("hc");

        // set names for each user
        admininistrator.setName("Leo");
        financeOfficer.setName("Ssuka");
        healthCareOfficer.setName("Mwine");

        // set roles
        admininistrator.setRole("Admin");
        financeOfficer.setRole("Finance");
        healthCareOfficer.setRole("Health Care Provider");

        // print details
        admininistrator.printMyDetails();
        financeOfficer.printMyDetails();
        healthCareOfficer.printMyDetails();

        // print Start Messaging
        DebugLogger.printInfo("-- (Message Observer) Observer Pattern --");

        // * create observers to listen to messages
        GroupMessageObserver adminTeamMember = (GroupMessageObserver) admininistrator;
        GroupMessageObserver financeTeamMember = (GroupMessageObserver) financeOfficer;
        GroupMessageObserver healthTeamMember = (GroupMessageObserver) healthCareOfficer;

        // * Implement Messaging Functionality
        // create a messaging object
        MessagingFunctionality messaging = new MessagingFunctionality();

        // add top level team members
        messaging.addObserverToGroup(adminTeamMember);
        messaging.addObserverToGroup(financeTeamMember);
        messaging.addObserverToGroup(healthTeamMember);

        // remove a member
        messaging.removeObserverFromGroup(healthTeamMember);
        messaging.removeObserverFromGroup(adminTeamMember);

        // send message
        messaging.setMessage("Hello members");

        // Admin Sends Message to Finance
        adminTeamMember.notifyAnotherMember(financeTeamMember);

        // Finance Sends Message to HealthCareProvider
        financeTeamMember.notifyAnotherMember(healthTeamMember);

        // % stopped her

        // * Integrations
        // * Adapter Pattern
        // print Start Integrations
        DebugLogger.printInfo("-- (Integrations with Other Systems) Adapter Pattern  --");


         // * Billing
        // create a billing integration
        MedicalBillingSystemsIntegration billingIntegration = new MedicalBillingSystemsIntegration();

        // log billing intergration
        DebugLogger.logSuccess("Billing Integrated successfully.");

        // fetch billing information
        billingIntegration.fetchBillingInfo();

        // fetch billing history
        billingIntegration.fetchBillingHistory();

        // payment history
        billingIntegration.getPaymentHistory();

        // payment summary
        billingIntegration.getPaymentSummary();

        // * EHR
        PatientHealthInfoIntegration healthInfoIntegration = new PatientHealthInfoIntegration();

        // log ehr integrated
        DebugLogger.logSuccess("EHR Integrated successfully.");

        // * call integration methods
        // get health status
        healthInfoIntegration.getMedicalRecords();

        // get diagnosis
        healthInfoIntegration.fetchPatientDiagnoses();

        // get insurances
        healthInfoIntegration.fetchInsuranceInformation();

       
        // print End Integrations
        DebugLogger.logSuccess("- System Done --");
    }

}

// get a list of all users
// get their names and emails and put them in a list
// only if the user has a variable set to true