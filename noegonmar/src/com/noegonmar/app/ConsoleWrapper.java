package com.noegonmar.app;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase manejadora de la consola del sistema
 * 
 * La utilizamos para evitar que se muestre el password cuando se escribe en la consola
 * así como imprimir textos definidos en las plantillas de la aplicación
 * 
 * @author noegonmar
 *
 */
public class ConsoleWrapper {

	public static String promptPassword() {
		Console console = System.console();
		if (console == null) { // Si no encontramos la consola, es que estamos
								// en un IDE
			return "";
		}

		char passwordArray[] = console.readPassword("Contraseña: ");
		String pass = new String(passwordArray);
		return pass;
	}

	public static void printTemplate(String template)
			throws IOException {

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
