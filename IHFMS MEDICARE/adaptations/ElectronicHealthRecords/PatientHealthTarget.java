package adaptations.ElectronicHealthRecords;


// Methods that the client expects to interact with
public interface PatientHealthTarget {

    // get patients insurance information
    public void fetchInsuranceInformation();

    // get patients
    public void getAllPatients();

    // get health records
    public void getMedicalRecords();

    // get patient's diagnosis
    public void fetchPatientDiagnoses();

}
