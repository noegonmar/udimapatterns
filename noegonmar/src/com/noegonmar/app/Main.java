package com.noegonmar.app;

import com.noegonmar.patter.abstractfactory.BluRay;
import com.noegonmar.patter.abstractfactory.DVD;
import com.noegonmar.patter.abstractfactory.FabricaDiscos;
import com.noegonmar.patter.abstractfactory.FabricaDiscosCapaDoble;
import com.noegonmar.patter.abstractfactory.FabricaDiscosCapaSimple;


public class Main {

	public static void main(String[] args) {

		/*
		 * FabricaMulta multa
		 * Radar radar
		 * Semaforo semaforo
		 */
		FabricaDiscos fabrica;
		DVD dvd;
		BluRay bluray;
		
		/*
		 * multa = new FabricaMultaPuntos()
		 * radar = multa.crearMultaRadar()
		 * semaforo = radar.crearMultaSemaforo();
		 */
		fabrica = new FabricaDiscosCapaSimple();
		dvd = fabrica.crearDVD();
		bluray = fabrica.crearBluRay();
		 
		
		System.out.println(dvd);
		System.out.println(bluray);
		
		System.out.println("------------------------");
		
		 
		/*
		 * multa = new FabricaMultaSinPuntos();
		 * radar = multa.crearMultaRadar();
		 * semaforo = radar.crearMultaSemaforo();
		 */
		fabrica = new FabricaDiscosCapaDoble();
		dvd = fabrica.crearDVD();
		bluray = fabrica.crearBluRay();
		 
		System.out.println(dvd);
		System.out.println(bluray);
		
		
	}

}
