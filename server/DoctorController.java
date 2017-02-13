package cogent.hospital_management.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cogent.hospital_management.Entities.Doctor;
import cogent.hospital_management.Services.DoctorService;

@RequestMapping("/doctors")
@RestController
public class DoctorController {
	
	@Autowired
	DoctorService service;

	@RequestMapping(method=RequestMethod.GET, path="/{id}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Doctor getDoctor(@PathVariable String Id){
		return service.getDoctor(Id);
	}
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Doctor> getAllDoctors(){
		return service.getAllDoctor();
	}
	@RequestMapping(method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Doctor createDoctor(@RequestBody Doctor doctor){
		return service.createDoctor(doctor);
	}
	@RequestMapping(method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Doctor updateDoctor(@RequestBody Doctor doctor){
		return service.updateDoctor(doctor);
	}
	@RequestMapping(method=RequestMethod.DELETE, path="/{id}")
	public void deleteDoctor(@PathVariable String id){
		service.deleteDoctor(id);
		
	}
	
}
