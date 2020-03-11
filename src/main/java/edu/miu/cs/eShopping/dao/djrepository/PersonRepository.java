package edu.miu.cs.eShopping.dao.djrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs.eShopping.model.djmodel.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
}
