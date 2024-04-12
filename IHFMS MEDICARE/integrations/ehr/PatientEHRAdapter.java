package integrations.ehr;

// Integration of Patient Health Info electronic health records (EHR)
public interface PatientEHRAdapter {

    // get patients insurance information
    public void fetchInsuranceInformation();

    // get patients
    public void getAllPatients();

    // get health records
    public void getMedicalRecords();

    // get patient's diagnosis
    public void fetchPatientDiagnoses();

}
