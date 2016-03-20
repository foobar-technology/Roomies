package org.losdeveloperos.roomies.beans;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.losdeveloperos.roomies.db.AppUser;
import org.losdeveloperos.roomies.hibernate.HibernateSession;
import org.losdeveloperos.roomies.model.AppUserModel;

public class Register extends Form{

	/**
	 * Register Bean
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String userName;

	private String email;
	
	private String password;
	
	private String passwordConfirm;
	
	private AppUser user;
	
	public void registerUser(){ 
		FacesContext context = FacesContext.getCurrentInstance();
		if(password.equals(passwordConfirm)){
			user = new AppUser();
			user.setName(name);
			user.setUser(userName);
			user.setPassword(Integer.toHexString(password.hashCode()));
			user.setEmail(email);
			
			if(!AppUserModel.findByUserName(user.getUser()).isEmpty()){
				context.addMessage(null, new FacesMessage("Error",  "El usuario " + user.getUser() + " ya existe"));
			}else{
				context.addMessage(null, new FacesMessage("Registro exitoso",  "El usuario " + user.getUser() + " se registro exitosamente"));
				HibernateSession.saveObject(user);
				redirect("/index.xhtml");
			}
		}else{
			context.addMessage(null, new FacesMessage("Error",  "Las contraseñas no coinciden "));
		}
	}
	
	public void goBack(){
		System.out.println("regresar");
		redirect ("/index.xhtml");
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
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
