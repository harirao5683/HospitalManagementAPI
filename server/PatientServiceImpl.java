package cogent.hospital_management.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.hospital_management.Entities.Patient;
import cogent.hospital_management.Repositories.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	PatientRepository repo;

	@Override
	public Patient getPatient(String id) {
		
		return repo.getPatient(id);
	}

	@Override
	public List<Patient> getAllPatient() {
		
		return repo.getAllPatient();
	}

	@Override
	public Patient createPatient(Patient patient) {
		
		return repo.createPatient(patient);
	}

	@Override
	public Patient updatePatient(Patient patient) {
		
		return repo.updatePatient(patient);
	}

	@Override
	public void deletePatient(String id) {
		repo.deletePatient(id);
		
	}

}
