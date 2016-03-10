package org.losdeveloperos.roomies.beans;

public class Login extends Form{

	/**
	 * Login bean
	 */
	private static final long serialVersionUID = 1L;
	
	public String log(){
		System.out.println("login");
		return "/pages/register";
	}

}
