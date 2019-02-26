package com.enrique.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.enrique.entities.Role;
import com.enrique.entities.User;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Optional<User> findByName(String name);

	Optional<User> findFirstByOrderByIdDesc();

}