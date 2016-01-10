package com.noegonmar.app;

import java.util.HashMap;

/**
 * Clase que contiene los valores estáticos de la aplicación
 * 
 * En esta clase incluimos los usuarios del sistema por facilidad de uso 
 * para no depender de una BBDD y una encriptación de claves
 * 
 * @author noegonmar
 *
 */
public class Config {

	public final static String APP_NAME = "NoeGonMar";
	public final static String APP_VERSION = "1.0.0";

	public final static int APP_OPCION_SALIR = 9;
	private static HashMap<String, ClaveValor> APP_USERS = null;

	public static HashMap<String, ClaveValor> getAppUsers() {
		if (APP_USERS == null) {
			APP_USERS = new HashMap<String, ClaveValor>();
			APP_USERS.put("udima", new ClaveValor("udima", "udim4", "10"));
			APP_USERS.put("noe", new ClaveValor("noe", "n03", "20"));
		} 
		return APP_USERS;
	}
}
