package org.losdeveloperos.roomies.beans;

import org.losdeveloperos.roomies.db.AppUser;
import org.losdeveloperos.roomies.model.AppUserModel;

public class Main extends Form{

	/**
	 * Main Bean
	 */
	private static final long serialVersionUID = 1L;
	
	String user = "usuario";

	public void goSecond() {
		System.out.println("go to second");
        redirect ("/pages/main.xhtml#second");
    }
	
	public void getValue(){
		AppUser usr = AppUserModel.findByUserName("orlanzo").get(0);
		setUser(usr.getName());
		System.out.println(usr.getName());
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	public void print(){
		System.out.println("imprimir valor");
	}
	
}
