package com.slait.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slait.jba.entity.Blog;
import com.slait.jba.entity.Role;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
