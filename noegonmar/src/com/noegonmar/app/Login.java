package com.noegonmar.app;

import java.util.HashMap;

/**
 * Clase que implementa el login de la aplicación.
 * 
 * Checkea las credenciales para que se pueda instanciar la clase AppUser
 * en la que se utiliza el patrón singleton
 * 
 * @author noegonmar
 *
 */
public class Login {

	private String user;
	private String pass;

	public Login(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}

	public boolean checkCredentials() {
		
		HashMap<String, ClaveValor> usuarios = Config.getAppUsers();
		
		if (usuarios.containsKey(this.user)){
			if (usuarios.get(this.user).valor.equals(this.pass)){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}

	public String getAgente() {
		HashMap<String, ClaveValor> usuarios = Config.getAppUsers();
		
		if (usuarios.containsKey(this.user)){
			if (usuarios.get(this.user).valor.equals(this.pass)){
				return usuarios.get(this.user).masInfo.toString();
			}
			else{
				return null;
			}
		}
		else{
			return null;
		}
	}
}
