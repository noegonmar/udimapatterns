package com.noegonmar.pattern.decorator;

import com.noegonmar.patter.abstractfactory.Multa;

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