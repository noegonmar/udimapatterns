package com.noegonmar.pattern.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.noegonmar.patter.abstractfactory.Multa;
import com.noegonmar.patter.abstractfactory.MultaGraveConPuntos;

/**
 * Decorador que hace que el asistente de creación de multas nos pregunte por
 * los datos básicos y además por los puntos de la multa
 * 
 * @author noegonmar
 *
 */
public class DecoradorMultaGraveConPuntos extends Decorador {

	public DecoradorMultaGraveConPuntos(Multa multa) {
		super(multa);

	}

	/**
	 * Asistente extendido con la inclusión del atributo "Puntos"
	 */
	public void asistente() {
		System.out.println("----------  Usando patrón Decorador  ----------");
		super.asistente();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Puntos: ");
			((MultaGraveConPuntos) this.getMulta()).setPuntos(Integer.parseInt(br
					.readLine()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("---------- Fin del patrón Decorador -----------");
	}

}
