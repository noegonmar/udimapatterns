package com.noegonmar.patter.abstractfactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class MultaMuyGrave extends Multa {

	Boolean carcel = false;
	int puntos;

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public abstract String toString();

	public abstract boolean isCarcel();

	public abstract void setCarcel(String carcel);

	public abstract String toCSV();

	public void guardar() {

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("YYMMddHHmmss");
			this.idMulta = sdf.format(new Date());
			sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			this.fecha = sdf.format(new Date());

			PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter("db/multas.csv", true)));
			out.println(this.toCSV());
			out.close();
		} catch (IOException e) {
			// exception handling left as an exercise for the reader
		}
	}

}
