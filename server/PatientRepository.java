package cogent.hospital_management.Repositories;

import java.util.List;

import cogent.hospital_management.Entities.Patient;

public interface PatientRepository {

	public Patient getPatient(String id);
	public List<Patient> getAllPatient();
	public Patient createPatient(Patient patient);
	public Patient updatePatient(Patient patient);
	public void deletePatient(String id);
}
