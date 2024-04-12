package adaptations.ElectronicHealthRecords;


import debug.DebugLogger;
// An adapter class that extends the old system and implements operations expected by the client
public class PatientHealthAdapter extends PatientHealthAdaptee implements PatientHealthTarget {
    @Override
    public void getAllPatients() {

        // log info
        DebugLogger.printInfo("Getting all patients...");
        fetchAllPatients();

        // log success message
        DebugLogger.logSuccess("All patients retrieved successfully.");
    }
    @Override
    public void fetchPatientDiagnoses() {

        // log info
        DebugLogger.printInfo("Getting diagnosis...");

        // get diagnosis
        fetchDiagnosisRecords();

        // log success message
        DebugLogger.logSuccess("Diagnoses Fetched");
    }


    @Override
    public void fetchInsuranceInformation() {
        
        // get insurance information
        System.out.println("Getting insurance information...");

        fetchInsuranceRecords();

        // log success message
        DebugLogger.logSuccess("Insurance information retrieved successfully.");
    }
    @Override
    public void getMedicalRecords() {
        // log info
        DebugLogger.printInfo("Getting medical records...");

        // get health status
        fetchAllMedicalRecords();

        // log success message
        DebugLogger.logSuccess("Health records retrieved successfully.");
    }


}
