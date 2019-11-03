package com.nationwide.app.service;

import java.util.Date;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Criteria.*;
 
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.mongodb.client.MongoDatabase;
import com.nationwide.app.model.IndividualProjectBlogs;
import com.nationwide.app.repository.IndividualProjectBlogsRepository;

@Service
public class IndividualProjectBlogsService {
	
	@Autowired
	private IndividualProjectBlogsRepository individualProjectBlogsRepository;
	
	@Autowired 
	private MongoOperations mongoOperations;
	
	public IndividualProjectBlogs create(IndividualProjectBlogs blog) {
		return individualProjectBlogsRepository.save(blog);
	}
	
	public List<IndividualProjectBlogs> getAll() {
		return individualProjectBlogsRepository.findAll();
	}
	
	public Optional<IndividualProjectBlogs> getById(String id) {
		return individualProjectBlogsRepository.findById(id);
	}
	
	
	public void delete(String id) {
		individualProjectBlogsRepository.deleteById(id);
	}
	
	public IndividualProjectBlogs insertComment(String id, String comment, String username) {
			IndividualProjectBlogs b = IndividualProjectBlogsRepository.insert(comment, username);
			return individualProjectBlogsRepository.save(b);
			
	}
}
	
	



