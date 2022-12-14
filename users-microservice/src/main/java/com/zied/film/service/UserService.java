package com.zied.film.service;

import com.zied.film.entities.Role;
import com.zied.film.entities.User;

public interface UserService {
	
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	

}
