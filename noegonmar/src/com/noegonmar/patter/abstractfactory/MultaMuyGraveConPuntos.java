package com.noegonmar.patter.abstractfactory;

import com.noegonmar.patern.singleton.AppUser;

/**
 * Producto concreto de la factoría que extiende de la clase abstracta MultaMuyGrave
 * 
 * @author noegonmar
 *
 */
public class MultaMuyGraveConPuntos extends MultaMuyGrave {

	final static String tipoMulta = "MMGCP";

	public MultaMuyGraveConPuntos() {
		this.agente = AppUser.getAppUser().getNumAgente();
	}

	@Override
	public String toString() {

		String tieneCarcel = (carcel == true) ? "s" : "n";

		return "ID: " + idMulta + ", Tipo:" + tipoMulta + ", Fecha: " + fecha
				+ ", Matrícula: " + matricula + ", Vel. Vía: " + velocidadVia
				+ ", Vel. Vehículo: " + velocidadVehiculo + ", Sanción: "
				+ sancion + ", Puntos:" + puntos + ", Agente: " + agente
				+ ", Carcel:" + tieneCarcel;
	}

	@Override
	public String toCSV() {
		String tieneCarcel = (carcel == true) ? "s" : "n";
		return idMulta + "," + tipoMulta + "," + fecha + "," + matricula + ","
				+ velocidadVia + "," + velocidadVehiculo + "," + sancion + ","
				+ puntos + "," + agente + "," + tieneCarcel;
	}

	@Override
	public boolean isCarcel() {
		return carcel;
	}

	public void setCarcel(String carcel) {

		this.carcel = carcel.equals("s") ? true : false;

	}

}
