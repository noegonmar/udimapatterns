package com.noegonmar.pattern.strategy;

/**
 * Interfaz común a todos los algoritmos permitidos en la estrategia.
 * 
 * Esta interfaz deberá heredarla cada acción que pretenta formar parte de la estrategia.
 * 
 * @author noegonmar
 *
 */
public abstract class Using {

	public abstract void usePattern();

	public abstract String getPatternName();

}
