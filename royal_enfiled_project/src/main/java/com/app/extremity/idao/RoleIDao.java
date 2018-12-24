package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.Role;

public interface RoleIDao extends CrudRepository<Role, Integer> {

	Role findOneByRoleName(String employeeDesignation);

}
