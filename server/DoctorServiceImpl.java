package cogent.hospital_management.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.hospital_management.Entities.Doctor;
import cogent.hospital_management.Repositories.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	DoctorRepository repo;

	@Override
	public Doctor getDoctor(String id) {
		
		return repo.getDoctor(id);
	}

	@Override
	public List<Doctor> getAllDoctor() {
		
		return repo.getAllDoctor();
	}

	@Override
	public Doctor createDoctor(Doctor doctor) {
		
		return repo.createDoctor(doctor);
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		
		return repo.updateDoctor(doctor);
	}

	@Override
	public void deleteDoctor(String id) {
		
		repo.deleteDoctor(id);
	}

}
