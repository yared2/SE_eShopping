package edu.miu.cs.eShopping.service.djservice;

import java.util.List;

import edu.miu.cs.eShopping.model.djmodel.Role;

public interface RoleService {
	public abstract List<Role> getAllRoles();
	public abstract Role addRole(Role role);
	public abstract Role getRoleById(int id);
}
