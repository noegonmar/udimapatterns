package com.noegonmar.patter.abstractfactory;

public class SemaforoConPuntos extends Semaforo {

	@Override
	public Prototipo clone() {
		return null;
	}

	@Override
	public String getCapacidad() {
		return "37.4Gb";
	}

	@Override
	public String getNombre() {
		return "BlueRay II";
	}

	@Override
	public String getPrecio() {
		return "15$";
	}

}
