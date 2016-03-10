package org.losdeveloperos.roomies.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.losdeveloperos.roomies.db.AppUser;

public class Register extends Form{

	/**
	 * Register Bean
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private String passwordConfirm;
	
	private AppUser user;
	
	public void registerUser(){ 
		user = new AppUser();
		user.setId(1);
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}
	
	public String goBack(){
		return ("/index");
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

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

}
