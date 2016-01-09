package com.noegonmar.app;

public class Login {

	private String user;
	private String pass;
	
	public Login(String user, String pass){
		this.user = user;
		this.pass = pass;
	}
	
	public boolean checkCredentials(){
		if (user.equals(pass)){
			this.user = "";
			this.pass = "";
			return true;
		}
		return false;
		
	}
}
