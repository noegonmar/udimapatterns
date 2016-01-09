package com.noegonmar.pattern.strategy;

import com.noegonmar.patter.abstractfactory.FabricaMultas;
import com.noegonmar.patter.abstractfactory.FabricaMultasConPuntos;
import com.noegonmar.patter.abstractfactory.FabricaMultasSinPuntos;
import com.noegonmar.patter.abstractfactory.Radar;
import com.noegonmar.patter.abstractfactory.Semaforo;

public class UsingAbstractFactory extends Using {

	@Override
	public void usePattern() {

		// Usamos el patrón Abstract Factory

		FabricaMultas fabrica;
		Radar radar;
		Semaforo semaforo;
		
		fabrica = new FabricaMultasSinPuntos();
		radar = fabrica.crearRadar();
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