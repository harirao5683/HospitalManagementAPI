package cogent.hospital_management.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Id;

@Entity
@Table
public class Patient {

	@Id
	@GenericGenerator(name="custom", strategy="uuid2")
	@GeneratedValue(generator="custom")
	String Id;
	String firstName;
	String lastName;
	public List<Doctor> getMyDoctors() {
		return myDoctors;
	}
	public void setMyDoctors(List<Doctor> myDoctors) {
		this.myDoctors = myDoctors;
	}
	
	@ManyToMany
	List<Doctor> myDoctors;
	@OneToOne 
	Login login;
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
