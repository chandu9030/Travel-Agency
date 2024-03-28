package com.travel.Agency.Service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.travel.Agency.Entity.User;
import com.travel.Agency.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	public UserRepository userrepo;
	@Override
	
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userrepo.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(
            user.getUsername(), user.getPassword(), new ArrayList<>()
        );
	}

	public void userRegistration(User user) {
		User user1=new User();
		user1.setUsername(user1.getUsername());
	    user1.setEmail(user1.getEmail());
	    user1.setPassword(user1.getPassword());
	    userrepo.save(user1);
}
	@Override
	public User addUser(User user) {
		
		return userrepo.save(user);
	}
}