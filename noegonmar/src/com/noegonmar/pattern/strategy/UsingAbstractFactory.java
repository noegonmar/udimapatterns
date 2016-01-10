package com.noegonmar.pattern.strategy;

import com.noegonmar.patter.abstractfactory.FabricaMultas;
import com.noegonmar.patter.abstractfactory.FabricaMultasConPuntos;
import com.noegonmar.patter.abstractfactory.FabricaMultasSinPuntos;
import com.noegonmar.patter.abstractfactory.Radar;
import com.noegonmar.patter.abstractfactory.MultaMuyGrave;

public class UsingAbstractFactory extends Using {

	@SuppressWarnings("unused")
	@Override
	public void usePattern() {

		// Usamos el patrón Abstract Factory

		FabricaMultas fabrica;
		Radar radar;
		MultaMuyGrave semaforo;
		
		fabrica = new FabricaMultasSinPuntos();
		radar = fabrica.crearMulta();
		semaforo = fabrica.crearSemaforo();

		fabrica = new FabricaMultasConPuntos();
		radar = fabrica.crearRadar();
		semaforo = fabrica.crearSemaforo();

	}

	@Override
	public String getPatternName() {
		return "AbstractFactory";
	}

}