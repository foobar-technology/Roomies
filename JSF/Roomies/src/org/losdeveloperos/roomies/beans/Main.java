package org.losdeveloperos.roomies.beans;

public class Main extends Form{

	/**
	 * Main Bean
	 */
	private static final long serialVersionUID = 1L;

	public void goSecond() {
		System.out.println("go to second");
        redirect ("/pages/main.xhtml#second");
    }
	
	public void print(){
		System.out.println("imprimir valor");
	}
	
}
