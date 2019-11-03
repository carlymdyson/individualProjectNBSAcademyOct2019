package com.nationwide.app.model;

import java.util.Date;
import java.util.List;

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
	private List blogcomments;
	private String comment;
	private String username;
	private Date commentdate;

	
	public IndividualProjectBlogs(String blogtitle, Date blogpostdate, String blogtext, String comment, String username, Date commentdate) {
		this.blogtitle = blogtitle;
		this.blogpostdate = blogpostdate;
		this.blogtext = blogtext;
		this.comment = comment;
		this.username = username;
		this.commentdate = commentdate;
	}
	
	public IndividualProjectBlogs(String blogtitle, Date blogpostdate, String blogtext) {
		this.blogtitle = blogtitle;
		this.blogpostdate = blogpostdate;
		this.blogtext = blogtext;
	}
	
	public IndividualProjectBlogs(String comment, String username) {
		this.comment = comment;
		this.username = username;
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

	public List getBlogcomments() {
		return blogcomments;
	}
	public void setBlogcomments(List blogcomments) {
		this.blogcomments = blogcomments;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getCommentdate() {
		return commentdate;
	}

	public void setCommentdate(Date commentdate) {
		this.commentdate = commentdate;
	}

	public String toString() {
		return this.blogtitle + this.blogtext;
	}
	
	
}


