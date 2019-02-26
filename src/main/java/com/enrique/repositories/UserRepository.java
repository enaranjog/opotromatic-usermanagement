package com.enrique.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.enrique.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
	Optional<User> findByName(String name);

	Optional<User> findFirstByOrderByIdDesc();

}