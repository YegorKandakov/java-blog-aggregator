package com.slait.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slait.jba.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String name);

}
