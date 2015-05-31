package com.slait.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slait.jba.entity.Blog;
import com.slait.jba.entity.Role;
import com.slait.jba.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
	
	List<Blog> findByUser(User user);
}
