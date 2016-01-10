package com.noegonmar.patter.abstractfactory;

/**
 * Interfaz que declara las operaciones que crean los objetos productos abstractos
 * 
 * @author noegonmar
 *
 */
public interface FabricaMultas {

	public MultaGrave crearMultaGrave();

	public MultaMuyGrave crearMultaMuyGrave();

}
