package cogent.hospital_management.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import cogent.hospital_management.Entities.ReceptionEmployee;
import cogent.hospital_management.Services.ReceptionEmpSevice;

@RestController
@RequestMapping("/receptionist")
public class ReceptionEmpController {

	@Autowired
	ReceptionEmpSevice service;
	@RequestMapping(method=RequestMethod.GET, path="/{id}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ReceptionEmployee getReception(String id){
		return service.getReceptionEmployee(id);
	}
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<ReceptionEmployee> getAllReceptionist(){
		return service.getAllReceptionEmp();
	}
	@RequestMapping(method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ReceptionEmployee createReceptionist(@RequestBody ReceptionEmployee emp){
		return service.createReceptionEmployee(emp);
	}
	@RequestMapping(method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ReceptionEmployee updateReceptionist(@RequestBody ReceptionEmployee emp){
		return service.updateReceptionEmployee(emp);
	}
	@RequestMapping(method=RequestMethod.DELETE, path="/{id}")
	public void deleteReceptionist(String id){
		service.deleteReceptionEmployee(id);
	}
	
}
