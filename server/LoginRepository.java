package cogent.hospital_management.Repositories;

import java.util.List;

import cogent.hospital_management.Entities.Login;

public interface LoginRepository {
	public Login getLogin(String id);
	public List<Login> getAllLogins();
	public Login createLogin(Login login);
	public Login updateLogin(Login login);
	public void deleteLogin(String id);
}
