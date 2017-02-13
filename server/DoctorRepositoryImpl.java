package cogent.hospital_management.Repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cogent.hospital_management.Entities.Doctor;

@Repository
public class DoctorRepositoryImpl implements DoctorRepository{

	@PersistenceContext
	EntityManager em;
	@Override
	public Doctor getDoctor(String id) {
		
		return em.find(Doctor.class, id);
	}

	@Override
	public List<Doctor> getAllDoctor() {
		
		return null;
	}

	@Override
	public Doctor createDoctor(Doctor doctor) {
		em.persist(doctor);
		return doctor;
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		em.merge(doctor);
		return doctor;
	}

	@Override
	public void deleteDoctor(String id) {
		Doctor doctor=em.find(Doctor.class, id);
		em.remove(doctor);
		
	}

	
}
