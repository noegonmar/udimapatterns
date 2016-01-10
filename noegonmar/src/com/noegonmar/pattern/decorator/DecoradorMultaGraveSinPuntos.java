package com.noegonmar.pattern.decorator;

import com.noegonmar.patter.abstractfactory.Multa;

/**
 * Decorador que hace usa el asistente de creación básico sin añadir nada más.
 * 
 * 
 * @author noegonmar
 *
 */
public class DecoradorMultaGraveSinPuntos extends Decorador {

	public DecoradorMultaGraveSinPuntos(Multa multa) {
		super(multa);
	}

	/**
	 * Asistente base
	 */
	public void asistente() {
		System.out.println("----------  Usando patrón Decorador  ----------");
		super.asistente();
		System.out.println("---------- Fin del patrón Decorador -----------");
	}

}
