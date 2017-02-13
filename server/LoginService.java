package cogent.hospital_management.Services;

import java.util.List;

import cogent.hospital_management.Entities.Login;

public interface LoginService {

	public Login getLogin(String id);
	public List<Login> getAllLogins();
	public Login createLogin(Login login);
	public Login updateLogin(Login login);
	public void deleteLogin(String id);
}
