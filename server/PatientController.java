package cogent.hospital_management.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cogent.hospital_management.Entities.Patient;
import cogent.hospital_management.Services.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	PatientService service;
	@RequestMapping(method=RequestMethod.GET, path="/{id}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Patient getPatient(String id){
		return service.getPatient(id);
	}
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Patient> getAllPatients(){
		return service.getAllPatient();
	}
	@RequestMapping(method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Patient createPatient(@RequestBody Patient patient){
		return service.createPatient(patient);
	}
	@RequestMapping(method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Patient updatePatient(@RequestBody Patient patient){
		return service.updatePatient(patient);
	}
	@RequestMapping(method=RequestMethod.DELETE, path="/{id}")
	public void deletePatient(String id){
		service.deletePatient(id);
	}
}
