package org.losdeveloperos.roomies.beans;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.losdeveloperos.roomies.db.AppUser;
import org.losdeveloperos.roomies.model.AppUserModel;

import util.SHAHash;

public class Login extends Form{

	/**
	 * Login bean
	 */
	private static final long serialVersionUID = 1L;
	
	private String user;
	
	private String password;
	
	
	/* Metodos de la clase*/
	public void log(){
		FacesContext context = FacesContext.getCurrentInstance();
		String hashPassword = SHAHash.hash(password);
		try{
			if(hashPassword.equals(AppUserModel.findByUserName(user).getPassword())){
				System.out.println("login");
				redirect ("/pages/house.xhtml");
			}else{
				context.addMessage(null, new FacesMessage("Error",  "El usuario o password son incorrectos"));
			}
		}catch(IndexOutOfBoundsException e){
			context.addMessage(null, new FacesMessage("Error",  "El usuario no existe"));
		}
		password = "";
		
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
