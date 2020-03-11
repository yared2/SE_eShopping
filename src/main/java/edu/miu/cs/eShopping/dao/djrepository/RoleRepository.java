package edu.miu.cs.eShopping.dao.djrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.miu.cs.eShopping.model.djmodel.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
	
}
