package com.noegonmar.app;

import java.util.HashMap;

import com.noegonmar.patern.singleton.AppUser;

public class Login {

	private String user;
	private String pass;

	public Login(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}

	public boolean checkCredentials() {
		
		HashMap<String, ClaveValor> usuarios = AppUser.getAppUser().getListaUsuarios();
		
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
		HashMap<String, ClaveValor> usuarios = AppUser.getAppUser().getListaUsuarios();
		
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
