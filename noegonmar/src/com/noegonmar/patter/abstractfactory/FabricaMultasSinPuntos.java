package com.noegonmar.patter.abstractfactory;

public class FabricaMultasSinPuntos implements FabricaMultas {

	@Override
	public Semaforo crearSemaforo() {
		return new SemaforoSinPuntos();
	}

	@Override
	public Radar crearRadar() {
		return new RadarSinPuntos();
	}

}
