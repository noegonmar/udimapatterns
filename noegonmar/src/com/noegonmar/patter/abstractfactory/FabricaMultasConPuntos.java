package com.noegonmar.patter.abstractfactory;

/**
 * Clase que implementa las operaciones de creación de productos concretos
 * 
 * @author noegonmar
 *
 */
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
