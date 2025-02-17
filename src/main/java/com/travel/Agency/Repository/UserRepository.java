package com.travel.Agency.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.Agency.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	User findByUsername(String username);

}
