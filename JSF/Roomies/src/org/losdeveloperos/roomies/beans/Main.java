package org.losdeveloperos.roomies.beans;

public class Main extends Form{

	/**
	 * Main Bean
	 */
	private static final long serialVersionUID = 1L;

	public String gotoSecond() {
		System.out.println("go to second");
        return "pm:second";
    }
	
	public void print(){
		System.out.println("imprimir valor");
	}
	
}
