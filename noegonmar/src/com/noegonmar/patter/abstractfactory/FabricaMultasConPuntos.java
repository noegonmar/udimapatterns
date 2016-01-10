package com.noegonmar.patter.abstractfactory;

public class FabricaMultasConPuntos implements FabricaMultas {

	@Override
	public MultaMuyGrave crearMultaMuyGrave() {
		return new MultaMuyGraveConPuntos();
	}

	@Override
	public MultaGrave crearMultaGrave() {
		return new MultaGraveConPuntos();
	}

}
