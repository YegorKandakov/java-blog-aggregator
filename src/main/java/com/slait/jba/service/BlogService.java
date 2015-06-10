package com.slait.jba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slait.jba.entity.Blog;
import com.slait.jba.entity.User;
import com.slait.jba.repository.BlogRepository;
import com.slait.jba.repository.UserRepository;

@Service
public class BlogService {
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private UserRepository userRepository;

	public void save(Blog blog, String name) {
		User user = userRepository.findByName(name);
		blog.setUser(user);
		blogRepository.save(blog);
		
	}

	public void delete(int id) {
		blogRepository.delete(id);	
	}

}
