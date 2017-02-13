package cogent.hospital_management.Services;

import java.util.List;

import cogent.hospital_management.Entities.Doctor;

public interface DoctorService {
	
	public Doctor getDoctor(String id);
	public List<Doctor> getAllDoctor();
	public Doctor createDoctor(Doctor doctor);
	public Doctor updateDoctor(Doctor doctor);
	public void deleteDoctor(String id);
	

}
