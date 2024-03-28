package com.travel.Agency.Service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.travel.Agency.Entity.User;
@Service
public interface UserService {

	void userRegistration(User user);

	User addUser(User user);

	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
