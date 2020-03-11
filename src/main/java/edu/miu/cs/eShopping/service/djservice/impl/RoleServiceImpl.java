package edu.miu.cs.eShopping.service.djservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs.eShopping.dao.djrepository.RoleRepository;
import edu.miu.cs.eShopping.model.djmodel.Role;
import edu.miu.cs.eShopping.service.djservice.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleRepository roleRepository;
	
	public RoleServiceImpl(RoleRepository roleRepository) {
		this.roleRepository=roleRepository;
	}
	
	@Override
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}

	@Override
	public Role addRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public Role getRoleById(int id) {
		return roleRepository.findById(id).orElse(null);
	}
	
}
