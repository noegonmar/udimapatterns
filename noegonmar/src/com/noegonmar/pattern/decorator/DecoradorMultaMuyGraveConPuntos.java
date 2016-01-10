package com.noegonmar.pattern.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.noegonmar.patter.abstractfactory.Multa;
import com.noegonmar.patter.abstractfactory.MultaGrave;

public class DecoradorMultaMuyGraveConPuntos extends Decorador {

	public DecoradorMultaMuyGraveConPuntos(Multa multa) {
		super(multa);

	}

	public void asistente() {
		System.out.println("----------  Usando patrón Decorador  ----------");
		super.asistente();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Puntos: ");
			((MultaGrave) this.getMulta()).setPuntos(Integer.parseInt(br
					.readLine()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("---------- Fin del patrón Decorador -----------");
	}
}
