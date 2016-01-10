package com.noegonmar.patter.abstractfactory;

public class FabricaMultasSinPuntos implements FabricaMultas {

	MultaGraveSinPuntos mgsp = new MultaGraveSinPuntos();

	@Override
	public MultaGrave crearMultaGrave() {
		return new MultaGraveSinPuntos();
	}

	@Override
	public MultaMuyGrave crearMultaMuyGrave() {
		// No existen las multas muy graves sin puntos
		return null;
	}

}
