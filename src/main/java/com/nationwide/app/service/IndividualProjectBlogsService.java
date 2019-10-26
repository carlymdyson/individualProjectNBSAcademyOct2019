package com.nationwide.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nationwide.app.model.IndividualProjectBlogs;
import com.nationwide.app.repository.IndividualProjectBlogsRepository;

@Service
public class IndividualProjectBlogsService {
	
	@Autowired
	private IndividualProjectBlogsRepository individualProjectBlogsRepository;
	
	public IndividualProjectBlogs create(String blogtitle, String blogtext) {
		return individualProjectBlogsRepository.save(new IndividualProjectBlogs(blogtitle, null, blogtext));
	}
	
	public List<IndividualProjectBlogs> getAll() {
		return individualProjectBlogsRepository.findAll();
	}
	
	public Optional<IndividualProjectBlogs> getById(String id) {
		return individualProjectBlogsRepository.findById(id);
	}
	
	public IndividualProjectBlogs update(String blogtitle, String blogtext) {
		IndividualProjectBlogs b = individualProjectBlogsRepository.findByBlogtitle(blogtitle);
		b.setBlogtitle(blogtitle);
		b.setBlogtext(blogtext);
		return individualProjectBlogsRepository.save(b);
	}

	
	public void delete(String id) {
		Optional<IndividualProjectBlogs> b = individualProjectBlogsRepository.findById(id);
		individualProjectBlogsRepository.deleteById(b);
	}

}
