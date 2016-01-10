package com.noegonmar.patter.abstractfactory;

import java.util.Date;

public abstract class Multa implements Prototipo {

	@Override
	public abstract Prototipo clone();

	public abstract String getMatricula();

	public abstract Date getFecha();

	public abstract float getSancion();
	
	public abstract int getPuntos();

	@Override
	public String toString() {
		return "Fecha: "+getFecha() + ", Matrícula: " + getMatricula() + ", Sanción: " + getSancion() + ", Puntos: " + getPuntos();
	}
}
