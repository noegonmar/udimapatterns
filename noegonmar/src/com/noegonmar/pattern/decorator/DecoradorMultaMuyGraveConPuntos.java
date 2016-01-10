package com.noegonmar.pattern.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.noegonmar.patter.abstractfactory.Multa;
import com.noegonmar.patter.abstractfactory.MultaMuyGrave;

/**
 * Decorador que hace que el asistente de creación de multas nos pregunte por
 * los datos básicos y además por los puntos de la multa así como si tiene o no pena de carcel
 * 
 * @author noegonmar
 *
 */
public class DecoradorMultaMuyGraveConPuntos extends Decorador {

	public DecoradorMultaMuyGraveConPuntos(Multa multa) {
		super(multa);

	}

	/**
	 * Asistente extendido con la inclusión de los atributos "Puntos" y Carcel"
	 */
	public void asistente() {
		System.out.println("----------  Usando patrón Decorador  ----------");
		super.asistente();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Puntos: ");
			((MultaMuyGrave) this.getMulta()).setPuntos(Integer.parseInt(br
					.readLine()));
			System.out.println("Carcel (s/n): ");
			((MultaMuyGrave) this.getMulta()).setCarcel(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("---------- Fin del patrón Decorador -----------");
	}
}
