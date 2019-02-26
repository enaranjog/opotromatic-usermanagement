package com.enrique.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.enrique.entities.User;
import com.enrique.entities.UserRoleMapping;

public interface UserRoleMappingRepository extends CrudRepository<UserRoleMapping, Long> {
	Optional<User> findByUser(String name);

	Optional<User> findByRole(String name);

	Optional<User> findFirstByOrderByIdDesc();

}