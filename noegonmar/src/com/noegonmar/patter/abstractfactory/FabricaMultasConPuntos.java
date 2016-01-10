package com.noegonmar.patter.abstractfactory;

public class FabricaMultasConPuntos implements FabricaMultas {

	MultaGraveConPuntos mgcp;
	MultaMuyGraveConPuntos mmgcp;

	@Override
	public MultaGrave crearMultaGrave() {
		mgcp = new MultaGraveConPuntos();
		return mgcp;
	}

	@Override
	public MultaMuyGrave crearMultaMuyGrave() {
		mmgcp = new MultaMuyGraveConPuntos();
		return mmgcp;
	}

}
