package com.noegonmar.pattern.decorator;

import com.noegonmar.patter.abstractfactory.Multa;

/**
 * Decorador de la clase Multa para modificar el asistente de creación de multas.
 * Mediante el decorador, hemos definido un wizard básico, el cual extendemos con 
 * otras propiedades que son particulares de productos concretos de la factoría
 * como són:
 * - MultaGraveConPuntos > el wizard, además de los datos básicos, nos preguntas por los puntos
 * - MultaMuyGraveConPuntos > el wizard nos pregunta ademas por los puntos y por si tiene o no pena de carcel
 * 
 * @author noegonmar
 *
 */
public abstract class Decorador extends Multa {
	private Multa _multa;

	public Multa getMulta() {
		return _multa;
	}

	public Decorador(Multa multa) {
		_multa = multa;
	}

	public void asistente() {
		_multa.wizard();
	}
}