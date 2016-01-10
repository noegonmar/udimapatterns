package com.noegonmar.patter.abstractfactory;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public abstract class MultaGrave extends Multa {

	int puntos;

	@Override
	public abstract String toString();

	public abstract String toCSV();

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public void guardar() {

		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter("db/multas.csv", true)));
			out.println(this.toCSV());
			out.close();
		} catch (IOException e) {
			// exception handling left as an exercise for the reader
		}
	}

}
