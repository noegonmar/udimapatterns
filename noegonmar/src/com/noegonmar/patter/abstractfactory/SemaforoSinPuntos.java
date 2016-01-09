package com.noegonmar.patter.abstractfactory;

public class SemaforoSinPuntos extends Semaforo {

	@Override
	public Prototipo clone() {
		return null;
	}

	@Override
	public String getCapacidad() {
		return "18.7Gb";
	}

	@Override
	public String getNombre() {
		return "BlueRay";
	}

	@Override
	public String getPrecio() {
		return "9$";
	}

}
