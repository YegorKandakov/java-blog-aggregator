package com.slait.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slait.jba.entity.Role;
import com.slait.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);

}
