package com.noegonmar.pattern.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.noegonmar.app.Config;
import com.noegonmar.app.ConsoleWrapper;
import com.noegonmar.patter.abstractfactory.FabricaMultas;
import com.noegonmar.patter.abstractfactory.FabricaMultasConPuntos;
import com.noegonmar.patter.abstractfactory.FabricaMultasSinPuntos;
import com.noegonmar.patter.abstractfactory.MultaGrave;
import com.noegonmar.patter.abstractfactory.MultaMuyGrave;
import com.noegonmar.pattern.decorator.DecoradorMultaGraveConPuntos;
import com.noegonmar.pattern.decorator.DecoradorMultaGraveSinPuntos;
import com.noegonmar.pattern.decorator.DecoradorMultaMuyGraveConPuntos;

/**
 * Algorimto que usa el patrón AbstractFactory a través del patrón Strategy
 * 
 * Extiende de Using e implementa el método usePattern() para formar parte de la estrategia
 * 
 * @author noegonmar
 *
 */
public class UsingAbstractFactory extends Using {

	@Override
	public void usePattern() {

		// Usamos el patrón Abstract Factory
		FabricaMultas fabrica = null;
		MultaGrave multaGrave = null;
		MultaMuyGrave multaMuyGrave = null;

		try {
			int accion = 0;

			while (accion != Config.APP_OPCION_SALIR) {
				//Imprimimos el menú de creación
				ConsoleWrapper.printTemplate("MenuCreate");
				try {
					BufferedReader br = new BufferedReader(
							new InputStreamReader(System.in));
					accion = Integer.parseInt(br.readLine());
				} catch (NumberFormatException nfe) {
					System.err.println("Opción inválida!");
				}

				//Cada acción crea una multa (productoConcreto) distinta
				switch (accion) {
				case 1:
					//Creación de una multa sin puntos a través de AbstractFactory
					fabrica = new FabricaMultasSinPuntos();
					multaGrave = fabrica.crearMultaGrave();

					//Para crear la multa nos hacen falta una serie de datos
					//estos datos los pedimos de una manera u otra a través del patron decorador
					DecoradorMultaGraveSinPuntos decoradorMultaGraveSinPuntos = new DecoradorMultaGraveSinPuntos(
							multaGrave);
					decoradorMultaGraveSinPuntos.asistente();

					//Guardamos la multa creada
					multaGrave.guardar();

					break;
				case 2:
					//Creación de una multa sin puntos a través de AbstractFactory
					fabrica = new FabricaMultasConPuntos();
					multaGrave = fabrica.crearMultaGrave();
					
					//Para crear la multa nos hacen falta una serie de datos
					//estos datos los pedimos de una manera u otra a través del patron decorador
					DecoradorMultaGraveConPuntos decoradorMultaGraveConPuntos = new DecoradorMultaGraveConPuntos(
							multaGrave);
					decoradorMultaGraveConPuntos.asistente();

					multaGrave.guardar();

					break;
				case 3:
					//Creación de una multa sin puntos a través de AbstractFactory
					fabrica = new FabricaMultasConPuntos();
					multaMuyGrave = fabrica.crearMultaMuyGrave();
					
					//Para crear la multa nos hacen falta una serie de datos
					//estos datos los pedimos de una manera u otra a través del patron decorador
					DecoradorMultaMuyGraveConPuntos decoradorMultaMuyGraveConPuntos = new DecoradorMultaMuyGraveConPuntos(
							multaMuyGrave);
					decoradorMultaMuyGraveConPuntos.asistente();

					//Guardamos la multa creada
					multaMuyGrave.guardar();
					break;
				case 9:
					// Volvemos al menú anterior
					break;
				}
			}
			System.out.println(">> Multa creada!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String getPatternName() {
		return "AbstractFactory";
	}

}