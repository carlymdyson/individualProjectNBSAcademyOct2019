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

import com.nationwide.app.model.IndividualProjectBlogs;
import com.nationwide.app.repository.IndividualProjectBlogsRepository;

@Service
public class IndividualProjectBlogsService {
	
	@Autowired
	private IndividualProjectBlogsRepository individualProjectBlogsRepository;
	
	@Autowired 
	private MongoOperations mongoOperations;
	
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
	
	public IndividualProjectBlogs insertComment(String id, String comment, String username) {
		IndividualProjectBlogs b = IndividualProjectBlogsRepository.insert(comment, username);
		return individualProjectBlogsRepository.save(b);
		
//		currentDate(String commentdate)
	}
	
	
//	public Document insertComment(@RequestParam String comment, @RequestParam String username, @RequestParam Date commentdate) {
//		IndividualProjectBlogs b = individualProjectBlogsService.insert(blogcomments.comment, blogcomments.username,blogcomments.commentdate);
//		return b.toString();
		

}
