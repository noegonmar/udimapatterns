package com.noegonmar.patter.abstractfactory;

public class MultaGraveSinPuntos extends MultaGrave {

	final static String tipoMulta = "MGSP";
	
	@Override
	public String toString() {
		return "ID: "+idMulta+", Tipo:"+tipoMulta+", Fecha: "+fecha+", Matrícula: "+matricula+
				", Vel. Vía: "+velocidadVia+
				", Vel. Vehículo: "+velocidadVehiculo+
				", Sanción: "+sancion+", Agente: "+agente;
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
				",0"+ // Puntos
				","+agente+
				",0"; // carcel
	}

}
