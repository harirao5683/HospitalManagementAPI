package cogent.hospital_management.Repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cogent.hospital_management.Entities.ReceptionEmployee;

@Repository
public class ReceptionEmpRepoImpl implements ReceptionEmpRepo{

	@PersistenceContext
	EntityManager em;
	@Override
	public ReceptionEmployee getReceptionEmployee(String Id) {
		
		return em.find(ReceptionEmployee.class, Id);
	}

	@Override
	public List<ReceptionEmployee> getAllReceptionEmp() {
		
		return null;
	}

	@Override
	public ReceptionEmployee createReceptionEmployee(ReceptionEmployee emp) {
		
		em.persist(emp);
		return emp;
	}

	@Override
	public ReceptionEmployee updateReceptionEmployee(ReceptionEmployee emp) {
		em.merge(emp);
		return emp;
	}

	@Override
	public void deleteReceptionEmployee(String id) {
		ReceptionEmployee emp=em.find(ReceptionEmployee.class, id);
		em.remove(emp);
		
	}

}
