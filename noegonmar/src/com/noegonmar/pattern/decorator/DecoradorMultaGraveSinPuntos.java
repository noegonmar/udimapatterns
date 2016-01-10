package com.noegonmar.pattern.decorator;

import com.noegonmar.patter.abstractfactory.Multa;

public class DecoradorMultaGraveSinPuntos extends Decorador {

	public DecoradorMultaGraveSinPuntos(Multa multa) {
		super(multa);
	}

	public void asistente() {
		System.out.println("----------  Usando patrón Decorador  ----------");
		super.asistente();
		System.out.println("---------- Fin del patrón Decorador -----------");
	}

}
