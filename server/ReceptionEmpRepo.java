package cogent.hospital_management.Repositories;

import java.util.List;

import cogent.hospital_management.Entities.ReceptionEmployee;

public interface ReceptionEmpRepo {
	public ReceptionEmployee getReceptionEmployee(String Id);
	public List<ReceptionEmployee> getAllReceptionEmp();
	public ReceptionEmployee createReceptionEmployee(ReceptionEmployee employee);
	public ReceptionEmployee updateReceptionEmployee(ReceptionEmployee employee);
	public void deleteReceptionEmployee(String id);

}
