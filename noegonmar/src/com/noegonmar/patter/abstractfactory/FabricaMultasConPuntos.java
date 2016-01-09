package com.noegonmar.patter.abstractfactory;

public class FabricaMultasConPuntos implements FabricaMultas {
	 
    @Override
    public Semaforo crearSemaforo() {
            return new SemaforoConPuntos();
    }

    @Override
    public Radar crearRadar() {
            return new RadarConPuntos();
    }

}
