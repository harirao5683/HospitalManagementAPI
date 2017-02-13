package cogent.hospital_management.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.hospital_management.Entities.Login;
import cogent.hospital_management.Repositories.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginRepository repo;
	@Override
	public Login getLogin(String id) {
		
		return repo.getLogin(id);
	}

	@Override
	public List<Login> getAllLogins() {
				
		return repo.getAllLogins();
	}

	@Override
	public Login createLogin(Login login) {
		
		return repo.createLogin(login);
	}

	@Override
	public Login updateLogin(Login login) {
		
		return repo.updateLogin(login);
	}

	@Override
	public void deleteLogin(String id) {
		
		repo.deleteLogin(id);
	}

}
