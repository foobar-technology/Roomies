package org.losdeveloperos.roomies.beans;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.losdeveloperos.roomies.db.AppUser;
import org.losdeveloperos.roomies.model.AppUserModel;

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
		password = Integer.toHexString(password.hashCode());
		try{
			if(password.equals(AppUserModel.findByUserName(user).get(0).getPassword())){
				System.out.println("login");
				redirect ("/pages/main.xhtml");
			}else{
				context.addMessage(null, new FacesMessage("Error",  "El usuario o password son incorrectos"));
			}
		}catch(IndexOutOfBoundsException e){
			context.addMessage(null, new FacesMessage("Error",  "El usuario no existe"));
		}
		
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
