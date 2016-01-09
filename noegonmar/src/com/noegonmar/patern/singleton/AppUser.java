package com.noegonmar.patern.singleton;

// noegonmar: Singleton Patter - Creational pattern design

public class AppUser {

	private String username;
	private String numagente;
	private static AppUser appUser;

	/**
	 * Dado que el constructor de esta clase es privado (por usar Singleton),
	 * esta función nos devuelve el objeto creado con anterioridad o,
	 * si no está creado, lo crea en ese mismo momento.
	 * Así se evita que existan más de 1 objeto de esta clase a la vez
	 *
	 * @return AppUser
	 */
	public static AppUser getAppUser() {
		if (appUser == null) {
			appUser = new AppUser();
		}
		return appUser;
	}
	
	/**
	 * Dado que el constructor de esta clase es privado (por usar Singleton),
	 * esta función nos devuelve el objeto creado con anterioridad o,
	 * si no está creado, lo crea en ese mismo momento.
	 * Así se evita que existan más de 1 objeto de esta clase a la vez
	 *
	 * @return AppUser
	 */
	public static AppUser getAppUser(String username, String numagente) {
		if (appUser == null) {
			appUser = new AppUser(username, numagente);
		}
		return appUser;
	}

	/**
	 * Constructor privado para respetar el patrón Singleton
	 * @param username
	 * @param numagente
	 */
	private AppUser(String username, String numagente) {
		this.username = username;
		this.numagente = numagente;
	}
	
	/**
	 * Constructor privado para respetar el patrón Singleton
	 * @param username
	 * @param numagente
	 */
	private AppUser() {
		this.username = "";
		this.numagente = "";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNumAgente() {
		return numagente;
	}

	public void setNumAgente(String numagente) {
		this.numagente = numagente;
	}

}
