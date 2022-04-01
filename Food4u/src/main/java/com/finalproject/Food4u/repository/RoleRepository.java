package com.finalproject.Food4u.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.Food4u.model.Role;
import com.finalproject.Food4u.model.User;

public interface RoleRepository extends JpaRepository<Role, Integer>{

 


}
