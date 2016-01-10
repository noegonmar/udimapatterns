package com.noegonmar.patter.abstractfactory;

import java.util.Date;

public abstract class Multa implements Prototipo {

	@Override
	
	public abstract Prototipo clone();
	
	public abstract String getAgente(String agente);

	public abstract String getMatricula();

	public abstract Date getFecha();
	
	public abstract String getVelocidadVia();

	public abstract float getSancion();
	
	public abstract int getPuntos();
	
	public abstract String getArticulo();

	@Override
	public String toString() {
		return  "Fecha: "+getFecha() + ", Matrícula: " + getMatricula() + ", Velocidad de la via: " + getVelocidadVia() + ", Sanción: " + getSancion() + ", Puntos: " + getPuntos() + ", Artículo: " + getArticulo() ;
	}
}
