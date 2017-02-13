package cogent.hospital_management.Services;

import java.util.List;

import cogent.hospital_management.Entities.ReceptionEmployee;

public interface ReceptionEmpSevice {
	
	public ReceptionEmployee getReceptionEmployee(String Id);
	public List<ReceptionEmployee> getAllReceptionEmp();
	public ReceptionEmployee createReceptionEmployee(ReceptionEmployee employee);
	public ReceptionEmployee updateReceptionEmployee(ReceptionEmployee employee);
	public void deleteReceptionEmployee(String id);
	
	

}
