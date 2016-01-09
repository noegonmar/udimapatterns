package com.noegonmar.app;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;

public class ConsoleWrapper {

	public static String promptPassword(){
		Console console = System.console();
	    if (console == null) { //Si no encontramos la consola, es que estamos en un IDE
	        return "";
	    }

	    char passwordArray[] = console.readPassword("Contraseña: ");
	    String pass = new String(passwordArray);
	    return pass;
	}
	public static void clearConsole() throws IOException {
		final String os = System.getProperty("os.name");

		if (os.contains("Windows")) {
			Runtime.getRuntime().exec("cls");
		} else {
			Runtime.getRuntime().exec("clear");
		}
	}

	public static void printTemplate(String template, boolean clearConsole)
			throws IOException {

		if (clearConsole) {
			clearConsole();
		}

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("templates/" + template));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
