package org.losdeveloperos.roomies.beans;

public class Login extends Form{

	/**
	 * Login bean
	 */
	private static final long serialVersionUID = 1L;
	
	private String user;
	
	private String password;
	
	
	/* Metodos de la clase*/
	public void log(){
		System.out.println("login");
		redirect ("/pages/main.xhtml");
	}
	
	public void register(){
		redirect("/pages/register.xhtml");
	}
	
	
	/*Getters and Setters*/
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
