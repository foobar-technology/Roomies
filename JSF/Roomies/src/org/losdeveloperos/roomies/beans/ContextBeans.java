package org.roomies.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ContextBeans implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Main mainBean;
	
	private Login loginBean;
	
	private Register registerBean;

	public Main getMainBean() {
		if (mainBean == null){
			mainBean = new Main();
		}
		return mainBean;
	}

	public void setMainBean(Main mainBean) {
		this.mainBean = mainBean;
	}

	public Login getLoginBean() {
		if (loginBean == null){
			loginBean = new Login();
		}
		return loginBean;
	}

	public void setLoginBean(Login loginBean) {
		this.loginBean = loginBean;
	}

	public Register getRegisterBean() {
		if (registerBean == null){
			registerBean = new Register();
		}
		return registerBean;
	}

	public void setRegisterBean(Register registerBean) {
		this.registerBean = registerBean;
	}
	
}
