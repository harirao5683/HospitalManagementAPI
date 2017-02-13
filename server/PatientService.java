package cogent.hospital_management.Services;

import java.util.List;

import cogent.hospital_management.Entities.Patient;

public interface PatientService {
	
	public Patient getPatient(String id);
	public List<Patient> getAllPatient();
	public Patient createPatient(Patient patient);
	public Patient updatePatient(Patient patient);
	public void deletePatient(String id);
	

}
