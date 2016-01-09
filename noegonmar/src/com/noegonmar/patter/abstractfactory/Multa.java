package com.noegonmar.patter.abstractfactory;

public abstract class Multa implements Prototipo{

	@Override
    public abstract Prototipo clone();
 
    public abstract String getCapacidad();
 
    public abstract String getNombre();
 
    public abstract String getPrecio();
 
    @Override
    public String toString() {
            return getNombre() + " (" + getCapacidad() + ")";
    }
}
