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
				ConsoleWrapper.printTemplate("MenuCreate", true);
				try {
					BufferedReader br = new BufferedReader(
							new InputStreamReader(System.in));
					accion = Integer.parseInt(br.readLine());
				} catch (NumberFormatException nfe) {
					System.err.println("Opción inválida!");
				}

				switch (accion) {
				case 1:
					fabrica = new FabricaMultasSinPuntos();
					multaGrave = fabrica.crearMultaGrave();
					DecoradorMultaGraveSinPuntos decoradorMultaGraveSinPuntos = new DecoradorMultaGraveSinPuntos(
							multaGrave);
					decoradorMultaGraveSinPuntos.asistente();

					multaGrave.guardar();

					break;
				case 2:
					fabrica = new FabricaMultasConPuntos();
					multaGrave = fabrica.crearMultaGrave();
					DecoradorMultaGraveConPuntos decoradorMultaGraveConPuntos = new DecoradorMultaGraveConPuntos(
							multaGrave);
					decoradorMultaGraveConPuntos.asistente();

					multaGrave.guardar();

					break;
				case 3:
					fabrica = new FabricaMultasConPuntos();
					multaMuyGrave = fabrica.crearMultaMuyGrave();
					DecoradorMultaMuyGraveConPuntos decoradorMultaMuyGraveConPuntos = new DecoradorMultaMuyGraveConPuntos(
							multaMuyGrave);
					decoradorMultaMuyGraveConPuntos.asistente();

					multaMuyGrave.guardar();
					break;
				case 9:
					// Volvemos al menú anterior
					break;
				}
			}
			System.out.println("Multa creada!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String getPatternName() {
		return "AbstractFactory";
	}

}