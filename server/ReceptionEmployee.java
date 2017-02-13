package cogent.hospital_management.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Table
public class ReceptionEmployee {
	
	@Id
	@GenericGenerator(name="custom", strategy="uuid2")
	@GeneratedValue(generator="custom")
	String Id;
	String firstName;
	String lastName;
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
