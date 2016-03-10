package org.roomies.beans;

public class Register extends Form{

	/**
	 * Register Bean
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private String passwordConfirm;
	
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
