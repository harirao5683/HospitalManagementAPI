package cogent.hospital_management.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Doctor {
	
	@Id
	@GenericGenerator(name="custom", strategy="uuid2")
	@GeneratedValue(generator="custom")
	String Id;
	
	String firstName;
	String lastName;
	@OneToOne
	Login login;
	
	@ManyToMany
	List<Patient> myPatients;
	public List<Patient> getMyPatients() {
		return myPatients;
	}
	public void setMyPatients(List<Patient> myPatients) {
		this.myPatients = myPatients;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}

}
