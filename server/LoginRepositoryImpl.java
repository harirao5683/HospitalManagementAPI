package cogent.hospital_management.Repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cogent.hospital_management.Entities.Login;

@Repository
public class LoginRepositoryImpl implements LoginRepository {

	@PersistenceContext
	EntityManager em;
	@Override
	public Login getLogin(String id) {
		
		return em.find(Login.class,id);
	}

	@Override
	public List<Login> getAllLogins() {
		
		return null;
	}

	@Override
	public Login createLogin(Login login) {
		em.persist(login);		
		return login;
	}

	@Override
	public Login updateLogin(Login login) {
		em.merge(login);
		return null;
	}

	@Override
	public void deleteLogin(String id) {
		Login login=em.find(Login.class, id);		
		em.remove(login);
	}

}
