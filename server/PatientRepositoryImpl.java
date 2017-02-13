package cogent.hospital_management.Repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cogent.hospital_management.Entities.Patient;

@Repository
public class PatientRepositoryImpl implements PatientRepository{

	@PersistenceContext
	EntityManager em;
	@Override
	public Patient getPatient(String id) {
		
		return em.find(Patient.class, id);
	}

	@Override
	public List<Patient> getAllPatient() {
		
		return null;
	}

	@Override
	public Patient createPatient(Patient patient) {
		em.persist(patient);
		return patient;
	}

	@Override
	public Patient updatePatient(Patient patient) {
		em.merge(patient);
		return patient;
	}

	@Override
	public void deletePatient(String id) {
		Patient patient=em.find(Patient.class, id);
		em.remove(patient);
		
	}

	
}
