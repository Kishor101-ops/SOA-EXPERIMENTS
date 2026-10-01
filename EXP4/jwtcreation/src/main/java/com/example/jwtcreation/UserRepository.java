package com.example.jwtcreation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
		
	void findByUsername(String s);
}
