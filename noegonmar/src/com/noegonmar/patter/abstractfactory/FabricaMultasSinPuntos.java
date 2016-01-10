package com.noegonmar.patter.abstractfactory;

/**
 * Clase que implementa las operaciones de creación de productos concretos
 * 
 * @author noegonmar
 *
 */
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
