package cogent.hospital_management.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.hospital_management.Entities.ReceptionEmployee;
import cogent.hospital_management.Repositories.ReceptionEmpRepo;

@Service
public class ReceptionEmpServiceImpl implements ReceptionEmpSevice{

	@Autowired
	ReceptionEmpRepo repo;
	@Override
	public ReceptionEmployee getReceptionEmployee(String Id) {
		return repo.getReceptionEmployee(Id);
	}

	@Override
	public List<ReceptionEmployee> getAllReceptionEmp() {
		return repo.getAllReceptionEmp();
	}

	@Override
	public ReceptionEmployee createReceptionEmployee(ReceptionEmployee employee) {
		return repo.createReceptionEmployee(employee);
	}

	@Override
	public ReceptionEmployee updateReceptionEmployee(ReceptionEmployee employee) {
		
		return repo.updateReceptionEmployee(employee);
	}

	@Override
	public void deleteReceptionEmployee(String id) {
		repo.deleteReceptionEmployee(id);
		
	}
	
	
}
