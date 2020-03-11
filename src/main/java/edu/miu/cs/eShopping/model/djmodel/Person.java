package edu.miu.cs.eShopping.model.djmodel;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long personId;
	@NotBlank(message="*Le prenom est obligatoire.")
	private String firstName;
	private String middleName;
	@NotBlank(message="*Le nom est obligatoire")
	private String lastName;
	@NotNull
	private LocalDate dateOfBirth;
	
	public Person() {
		super();
	}
	
	public Person(long personId, String firstName, String middleName, String lastName,
			LocalDate dateOfBirth) {
		this.personId=personId;
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
		this.dateOfBirth=dateOfBirth;
	}

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
