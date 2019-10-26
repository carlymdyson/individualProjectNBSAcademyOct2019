package com.nationwide.app.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.nationwide.app.model.IndividualProjectBlogs;

@Repository
public interface IndividualProjectBlogsRepository extends MongoRepository<IndividualProjectBlogs, String> {
	public List<IndividualProjectBlogs> findAll();
	public Optional<IndividualProjectBlogs> findById(String id);
	public IndividualProjectBlogs findByBlogtitle(String blogtitle);
//	public IndividualProjectBlogs findById(String id);
	public void deleteById(Optional<IndividualProjectBlogs> b);


}
