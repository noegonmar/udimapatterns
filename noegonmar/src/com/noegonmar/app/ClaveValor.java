package com.noegonmar.app;

/**
 * Clase auxiliar que utilizaremos para formar ArrayList y HashMaps
 * Símplemente es una clase instanciable que contiene 3 atributos;
 * - clave > clave de la tupla
 * - valor > valor de la tupla
 * - masInfo > atributo por si es necesario añadir más información a la tupla "clave-valor"
 * @author noegonmar
 *
 */
public class ClaveValor {

	Object clave;
	Object valor;
	Object masInfo;
	
	public ClaveValor(Object clave, Object valor, Object masInfo){
		this.clave = clave;
		this.valor = valor;
		this.masInfo = masInfo;
	}
}
