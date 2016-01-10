package com.noegonmar.patter.abstractfactory;

public class FabricaMultasSinPuntos implements FabricaMultas {

	@Override
	public MultaGrave crearMultaGrave() {
		return new MultaGraveSinPuntos();
	}

	@Override
	public MultaMuyGrave crearMultaMuyGrave() {
		// TODO Auto-generated method stub
		return null;
	}

}
