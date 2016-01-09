package com.noegonmar.pattern.adapter;

public class Adaptador extends Objetivo {

	RadarConCarcel radarConCarcel = new RadarConCarcel();

	@Override
	public void getNombre() {
		radarConCarcel.getName();
	}

	@Override
	public void getPrecio() {
		radarConCarcel.getPrice();
	}

	@Override
	public void getCapacidad() {
		radarConCarcel.getCapacity();
	}

}
