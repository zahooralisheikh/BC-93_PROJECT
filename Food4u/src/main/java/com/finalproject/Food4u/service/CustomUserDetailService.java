package com.finalproject.Food4u.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.finalproject.Food4u.model.CustomUserDetail;
import com.finalproject.Food4u.model.User;
import com.finalproject.Food4u.repository.UserRepository;
@Service
public class CustomUserDetailService implements UserDetailsService{
	@Autowired
	public UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		 
		Optional<User> user = userRepository.findUserByEmail(email);
		user.orElseThrow(() -> new UsernameNotFoundException("User to nahi mila"));
		return user.map(CustomUserDetail::new).get();
	}
	
	
	

}
