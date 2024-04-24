package com.nelioalves.workshopmongo.domain;

import java.io.Serializable;
import java.util.Date;

import com.nelioalves.workshopmongo.dto.UserDTO;

public class Post implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private Date date;
	private String title;
	private String body;
	private UserDTO authorDTO;

	public Post() {

	}

	public Post(String id, Date date, String title, String body, UserDTO authorDTO) {
		this.id = id;
		this.date = date;
		this.title = title;
		this.body = body;
		this.authorDTO = authorDTO;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public UserDTO getAuthorDTO() {
		return authorDTO;
	}

	public void setAuthorDTO(UserDTO authorDTO) {
		this.authorDTO = authorDTO;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", date=" + date + ", title=" + title + ", body=" + body + "]";
	}

}
