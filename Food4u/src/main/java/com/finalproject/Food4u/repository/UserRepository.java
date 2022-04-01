package com.finalproject.Food4u.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.Food4u.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User>findUserByEmail(String email);

}
