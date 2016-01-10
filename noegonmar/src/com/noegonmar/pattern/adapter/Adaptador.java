package com.noegonmar.pattern.adapter;

import java.util.Date;

import com.noegonmar.patter.abstractfactory.Multa;
import com.noegonmar.patter.abstractfactory.Prototipo;

public class Adaptador extends Multa {

	MultaConCarcel multaConCarcel = new MultaConCarcel();

	@Override
	public Prototipo clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMatricula() {
		return multaConCarcel.dimeMatricula();
	}

	@Override
	public Date getFecha() {
		return multaConCarcel.dimeFechaMulta();
	}

	@Override
	public float getSancion() {
		// TODO
		String sancion = multaConCarcel.dimeSancion();
		String[] arrSancion = sancion.split("::");
		return Float.parseFloat(arrSancion[1]);
	}

	@Override
	public int getPuntos() {
		String sancion = multaConCarcel.dimeSancion();
		String[] arrSancion = sancion.split("::");
		return Integer.parseInt(arrSancion[2]);
		
	}

	@Override
	public String getAgente(String agente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVelocidadVia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getArticulo() {
		// TODO Auto-generated method stub
		return null;
	}

}
