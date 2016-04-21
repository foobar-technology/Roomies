package org.losdeveloperos.roomies.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Orlando
 *	Application User POJO
 */
@Entity (name="APP_USER")
public class AppUser {
	@Id
	@Column (name="APU_ID")
	@GeneratedValue
	private long id;
	
	@Column (name="APU_NAME")
	private String name;
	
	@Column (name="APU_USER")
	private String user;
	
	@Column (name="APU_EMAIL")
	private String email;
	
	@Column (name="APU_PASSWORD")
	private String password;
	
	/* Getters and Setters*/
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	
}
