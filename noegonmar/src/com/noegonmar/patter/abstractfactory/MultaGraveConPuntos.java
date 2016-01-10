package com.noegonmar.patter.abstractfactory;

import java.util.Date;

public class MultaGraveConPuntos extends MultaGrave {

	final static String tipoMulta = "MGCP";
	
	@Override
	public String toString() {
		return "ID: "+idMulta+", Tipo:"+tipoMulta+", Fecha: "+fecha+", Matrícula: "+matricula+
				", Vel. Vía: "+velocidadVia+
				", Vel. Vehículo: "+velocidadVehiculo+
				", Sanción: "+sancion+", Puntos:"+puntos+", Agente: "+agente;
	}

	@Override
	public String toCSV() {
		return 	idMulta+
				","+tipoMulta+
				","+fecha+
				","+matricula+
				","+velocidadVia+
				","+velocidadVehiculo+
				","+sancion+
				","+puntos+
				","+agente+
				",0"; // carcel
	}

}
