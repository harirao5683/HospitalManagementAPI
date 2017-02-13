package cogent.hospital_management.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cogent.hospital_management.Entities.Login;
import cogent.hospital_management.Services.LoginService;

@RequestMapping("/logins")
@RestController
public class LoginControllers {
	
	@Autowired
	LoginService service;
	@RequestMapping(method=RequestMethod.GET, path="/{id}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Login getLogin(String Id){
		return service.getLogin(Id);
	}
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Login> getAllLogins(){
		return service.getAllLogins();
	}
	@RequestMapping(method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Login createLogin(@RequestBody Login login){
		return service.createLogin(login);
	}
	@RequestMapping(method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Login updateLogin(@RequestBody Login login){
		return service.updateLogin(login);
	}
	@RequestMapping(method=RequestMethod.DELETE, path="/{id}")
	public void deleteLogin(String id){
		service.deleteLogin(id);
		
	}
	

}
