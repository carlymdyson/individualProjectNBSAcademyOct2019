package com.nationwide.app.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document
public class IndividualProjectBlogs {
	
	public IndividualProjectBlogs() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Id
	private String id;
	private String blogtitle;
	private Date blogpostdate;
	private String blogtext;
//	private List blogcomments;
	
	public IndividualProjectBlogs(String blogtitle, Date blogpostdate, String blogtext) {
		this.blogtitle = blogtitle;
		this.blogpostdate = blogpostdate;
		this.blogtext = blogtext;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getBlogtitle() {
		return blogtitle;
	}
	public void setBlogtitle(String blogtitle) {
		this.blogtitle = blogtitle;
	}

	public Date getBlogpostdate() {
		return blogpostdate;
	}
	public void setBlogpostdate(Date blogpostdate) {
		this.blogpostdate = blogpostdate;
	}

	public String getBlogtext() {
		return blogtext;
	}
	public void setBlogtext(String blogtext) {
		this.blogtext = blogtext;
	}

	
	public String toString() {
		return this.blogtitle + this.blogtext;
	}
	
	
}
