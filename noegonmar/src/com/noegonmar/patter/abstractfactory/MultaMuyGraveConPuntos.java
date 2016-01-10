package com.noegonmar.patter.abstractfactory;

import javax.rmi.CORBA.Tie;

public class MultaMuyGraveConPuntos extends MultaMuyGrave {

	final static String tipoMulta = "MMGCP";
	
	@Override
	public String toString() {
		
		String tieneCarcel = (carcel == true) ? "1" : "0";
		
		return "ID: "+idMulta+", Tipo:"+tipoMulta+", Fecha: "+fecha+", Matrícula: "+matricula+
				", Vel. Vía: "+velocidadVia+
				", Vel. Vehículo: "+velocidadVehiculo+
				", Sanción: "+sancion+", Puntos:"+puntos+", Agente: "+agente+", Carcel:"+tieneCarcel;
	}
	
	@Override
	public String toCSV() {
		String tieneCarcel = (carcel == true) ? "1" : "0";
		return 	idMulta+
				","+tipoMulta+
				","+fecha+
				","+matricula+
				","+velocidadVia+
				","+velocidadVehiculo+
				","+sancion+
				","+puntos+
				","+agente+
				","+tieneCarcel;
		}
	
	@Override
	public Boolean isCarcel() {
		return null;
	}


}
