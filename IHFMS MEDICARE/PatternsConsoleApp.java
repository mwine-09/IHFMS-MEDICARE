 

// import adaptations.ElectronicHealthRecords.PatientHealthAdapter;
// import adaptations.ElectronicHealthRecords.PatientHealthTarget;
// import debug.DebugLogger;
// import functionality.messaging.GroupMessagingObserver;
// import functionality.messaging.MessageProcessor;
// import functionality.messaging.MessagingFunctionality;
// import adaptations.billing.MedicalBillingAdapter;
// import adaptations.billing.MedicalBillingTarget;
// import user.*;

// public class PatternsConsoleApp {

//     public static void main(String[] args) {

//         // print start factory
//         DebugLogger.printInfo("-- Factory Pattern --");

//         // * Factory Pattern
//         SystemUserCreator userFactory = new SystemUserCreator();

//         // use factory pattern to create users
//         SystemUser financeOfficer = userFactory.createUser("FI");
//         SystemUser admininistrator = userFactory.createUser("AD");
//         SystemUser healthCareOfficer = userFactory.createUser("HC");

//         // set names for each user
//         admininistrator.setName("Leo");
//         financeOfficer.setName("Ssuka");
//         healthCareOfficer.setName("Mwine");

//         // set roles
//         admininistrator.setRole("Admin");
//         financeOfficer.setRole("Finance");
//         healthCareOfficer.setRole("Health Care Provider");

//         // print details
//         admininistrator.printMyDetails();
//         financeOfficer.printMyDetails();
//         healthCareOfficer.printMyDetails();

//         // print Start Messaging
//         DebugLogger.printInfo("-- (Message Observer) Observer Pattern --");

//         // * create observers to listen to messages

          

//         // * Implement Messaging Functionality
//         // create a messaging object
//         MessageProcessor messageProcessor = new MessageProcessor();

//         // add top level team members
//         messageProcessor.addObserverToGroup(adminTeamMember);
//         messageProcessor.addObserverToGroup(financeTeamMember);
//         messageProcessor.addObserverToGroup(healthTeamMember);

//         // remove a member
//         messageProcessor.removeObserverFromGroup(healthTeamMember);
//         messageProcessor.removeObserverFromGroup(adminTeamMember);

//         // send message
//         messageProcessor.setMessage("Hello members");

//         // Admin Sends Message to Finance
//         adminTeamMember.notifyAnotherMember(financeTeamMember);

//         // Finance Sends Message to HealthCareProvider
//         financeTeamMember.notifyAnotherMember(healthTeamMember);

//         // % stopped her

//         // * Integrations
//         // * Adapter Pattern
//         // print Start Integrations
//         DebugLogger.printInfo("-- (Integrations with Other Systems) Adapter Pattern  --");


//          // * Billing
//         // create a billing integration
//         MedicalBillingTarget medicalBillingTarget = new MedicalBillingAdapter();

//         // log billing intergration
//         DebugLogger.logSuccess("Billing Integrated successfully.");

//         // fetch billing information
//         medicalBillingTarget.retrieveBillingInformation();

//         // fetch billing history
//         medicalBillingTarget.retrieveBillingHistory();

//         // payment history
//         medicalBillingTarget.retrievePaymentHistory();

//         // payment summary
//         medicalBillingTarget.retrievePaymentSummary();

//         // ELECTRONIC HEALTH RECORDS
//         PatientHealthTarget healthInfoIntegration = new PatientHealthAdapter();

//         // log EHR integrated
//         DebugLogger.logSuccess("EHR Integrated successfully.");

//         // get health status
//         healthInfoIntegration.getMedicalRecords();

//         // get diagnosis
//         healthInfoIntegration.fetchPatientDiagnoses();

//         // get insurances
//         healthInfoIntegration.fetchInsuranceInformation();

       
//         // print End Integrations
//         DebugLogger.logSuccess("- System Done --");
//     }

// }

// // get a list of all users
// // get their names and emails and put them in a list
// // only if the user has a variable set to true