package com.noegonmar.patern.singleton;

// noegonmar: Singleton Patter - Creational pattern design

public class AppUser {

	private String username;
	private String language;
	private static AppUser appConfig;

	public static AppUser getAppUser(String username, String language) {
		if (appConfig == null) {
			appConfig = new AppUser(username, username);
		}
		return appConfig;
	}

	// Singleton pattern >> Private constructor
	private AppUser(String username, String language) {
		this.username = username;
		this.language = language;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
