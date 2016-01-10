package com.noegonmar.patter.abstractfactory;

public abstract class MultaMuyGrave extends Multa {

	Boolean carcel;
	int puntos;
	
	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public abstract String toString();

	public abstract Boolean isCarcel();
	
	public abstract void setCarcel(Boolean carcel);

	public abstract String toCSV();

}
