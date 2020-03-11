package edu.miu.cs.eShopping.service.djservice;

import java.util.List;

import edu.miu.cs.eShopping.model.djmodel.Person;

public interface PersonService {
	public abstract List<Person> getAllPersons();
	public abstract Person addPerson(Person person);
	public abstract Person getPersonById(int id);
	public abstract void deletePersonById();
}
