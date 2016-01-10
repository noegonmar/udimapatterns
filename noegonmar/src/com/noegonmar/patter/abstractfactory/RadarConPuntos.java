package com.noegonmar.patter.abstractfactory;

import java.util.Date;

public class RadarConPuntos extends Radar{

	@Override
    public Prototipo clone() {
            return new RadarConPuntos();
    }

	@Override
	public String getMatricula() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getFecha() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getSancion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPuntos() {
		// TODO Auto-generated method stub
		return 0;
	}

}
