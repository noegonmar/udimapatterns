package com.noegonmar.pattern.adapter;

import java.util.Date;

import com.noegonmar.patter.abstractfactory.Multa;
import com.noegonmar.patter.abstractfactory.Prototipo;

public class Adaptador extends Multa {

	RadarConCarcel radarConCarcel = new RadarConCarcel();

	@Override
	public Prototipo clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMatricula() {
		return radarConCarcel.dimeMatricula();
	}

	@Override
	public Date getFecha() {
		return radarConCarcel.dimeFechaMulta();
	}

	@Override
	public float getSancion() {
		// TODO
		String sancion = radarConCarcel.dimeSancion();
		String[] arrSancion = sancion.split("::");
		return Float.parseFloat(arrSancion[1]);
	}

	@Override
	public int getPuntos() {
		String sancion = radarConCarcel.dimeSancion();
		String[] arrSancion = sancion.split("::");
		return Integer.parseInt(arrSancion[2]);
		
	}

}
